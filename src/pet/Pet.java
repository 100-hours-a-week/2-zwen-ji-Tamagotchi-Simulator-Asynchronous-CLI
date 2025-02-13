package pet;

import system.Command;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Pet implements Serializable {
    private String currMessage;
    private String currImage;

    protected int level;
    protected int exp;

    transient protected List<Command> commandList = new ArrayList<>();
    @Serial
    private static final long serialVersionUID = 1L;
    public EventType eventType = null;
    public enum EventType {
        HATCH,      // 부화 이벤트
        LEVEL_UP,
        SPAWN,
        EVOLVE
    }


    /* getters, setters ============================================================================================*/
    protected void setCurrMessage(String currMessage) {
        this.currMessage = currMessage;
    }
    public String getCurrMessage() {
        return currMessage;
    }
    protected void setCurrImage(String currImage) {
        this.currImage = currImage;
    }
    public String getCurrImage() {
        return currImage;
    }

    public int getLevel() {
        return level;
    }
    public int getExp() {
        return exp;
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    /* core =======================================================================================================*/
    protected int randomByRange(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }
    
    public String  getDontKnowImage(){return null;}

    public abstract Set<EventType> getSupportedEvents();

    public abstract void updatePetState(boolean isActioned);

    public abstract void handleSpecialEvent();

    public abstract boolean checkSpecialEvent();

    public Pet createNewPet() {
        return null;
    }

    abstract void initializeCommands();

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        commandList = new ArrayList<>();
        initializeCommands();
    }
}




