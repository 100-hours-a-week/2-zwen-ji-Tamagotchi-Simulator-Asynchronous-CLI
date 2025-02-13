package system;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

class AudioPlayer extends Thread {
    private final Clip clip;
    private volatile boolean isRunning = true;
    private volatile boolean isPlaying = false;

    public AudioPlayer() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        File audioFile = new File(DeviceSetting.SFX1_AUDIO_PATH);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.addLineListener(event -> {
            if (event.getType() == LineEvent.Type.STOP) {
                isPlaying = false;
                clip.setFramePosition(0); // 중요: 재생 후 위치 초기화
            }
        });
    }

    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            synchronized (this) {
                notify();
            }
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                synchronized (this) {
                    while (!isPlaying && isRunning) {
                        wait();
                    }
                }

                if (!isRunning) break;

                if (clip.isOpen()) {
                    clip.setFramePosition(0);
                    clip.start();

                    // 재생 완료 대기
                    while (isPlaying) {
                        Thread.sleep(50);
                    }
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void close() {
        isRunning = false;
        isPlaying = false;
        synchronized (this) {
            notify();
        }
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
