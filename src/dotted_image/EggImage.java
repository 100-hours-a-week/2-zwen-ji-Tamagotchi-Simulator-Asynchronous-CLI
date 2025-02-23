package dotted_image;

public class EggImage {
    public static final String DEFAULT_IMAGE =
            """
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡤⠾⠛⠛⠛⠛⠷⢦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⣠⡶⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⢠⡞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⢀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡄⠀⠀⠀⠀⠀
                    ⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡆⠀⠀⠀⠀
                    ⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀
                    ⠀⠀⣾⠒⠒⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀
                    ⠀⣸⠃⠀⠀⠀⠀⠈⠀⠄⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⢱⠀⠀⣀⡠⠤⠤⢄⣸⣷⠀⠀
                    ⢀⡟⠀⠀⠀⠀⠀⠀⠀⠰⡀⠀⠀⠀⠀⠀⠐⠲⠤⠤⠔⠃⣠⠊⠁⠀⠀⠀⠀⢻⣿⣆⠀
                    ⢸⡇⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡄
                    ⣾⠙⠢⠤⠤⠤⠤⠤⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⣾⣿⣿⡀
                    ⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡄⠀⠀⠀⠀⢰⣿⣿⣿⡇
                    ⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⠀⠀⢀⣿⣿⣿⣿⡇
                    ⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⣾⣿⣿⣿⣿⠇
                    ⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⠿⠛⣿⡏⠀
                    ⠀⠹⣀⡤⠤⠤⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠃⠂⣼⡿⠁⠀
                    ⠀⠀⠻⣷⡀⠀⠀⠀⠈⠉⠒⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⡀⠈⣴⡿⠁⠀⠀
                    ⠀⠀⠀⠙⢷⣤⡀⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠊⠁⠀⣀⣼⠟⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠙⢿⣿⣷⣒⣶⣶⣶⠇⠀⠀⣀⡀⠤⢐⠊⠁⠀⢀⣠⣾⠟⠁⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣉⡁⠉⠉⠁⠀⡀⣀⣥⣥⣴⣾⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠉⠉⠉⠉⠉⠙⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""";

    public static final String HATCHING_IMAGE =
            """
                    ⠀⠀⠒⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⢠⠀⢸⠀⠀⠀⠀⠀⠀⠀⡞⡸⠁⠀⠀⠀⡼⠁⠀⢀⡞⠁⢀
                    ⡀⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢠⡀⠀⢠⠈⠀⡸⠀⠀⠀⠀⠀⠀⡸⢱⠃⠀⠀⠀⣸⠁⠀⢠⠏⠀⣠⠃
                    ⠑⣄⠀⠀⠱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣮⠅⠀⢸⡆⠀⡇⠀⠀⠀⠀⠀⢀⣇⠇⠀⠀⠀⣰⠃⠀⡰⠃⢀⡴⠁⠀
                    ⠀⠈⢂⠀⠀⠙⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠈⣿⠀⠀⠈⡇⢠⠇⠀⠀⠀⠀⠀⡾⡜⠀⠀⠀⣴⠃⠀⡼⠁⢀⠞⠀⠀⠀
                    ⠀⠀⠀⠢⡀⠀⠘⣄⠀⠀⠀⠀⠀⠀⠀⠀⠠⠋⠀⠀⠀⡇⠀⠀⡀⡇⢸⠀⠀⠀⠀⠀⣺⢱⠃⠀⠀⣼⠃⠀⡜⠀⣰⠋⠀⢀⢀⡀
                    ⠀⠀⠀⠀⠑⣄⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⢀⠀⠀⠃⣸⠀⡏⠙⢢⣠⢇⡏⠀⠀⣴⠃⢀⡞⢀⡜⠁⠀⠀⣰⠟⠀
                    ⠀⠀⠀⠀⠀⠈⢦⠀⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⢠⠀⡏⠀⠘⠒⢚⡟⡞⠀⠀⣼⠁⢠⠎⢠⠞⠀⠀⣠⠞⠁⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠱⡄⠈⢣⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⢸⣶⠀⢸⢀⡇⠀⠀⠀⡼⣸⠁⠀⡰⠁⣰⠋⡰⠋⠀⢀⡾⠃⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢸⠀⢸⢸⠀⠀⠀⢰⢳⠃⠀⣰⠃⡴⢃⡜⠁⠀⡰⠋⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡀⠱⡄⠀⠀⠀⠀⠀⠀⠀⢸⣸⡀⡌⢸⠀⠀⢀⣯⡏⠀⣰⢃⡼⣡⠎⠀⢀⠞⠁⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⣄⠙⡄⠀⠀⢀⣴⡶⣾⣿⠿⠻⡗⣿⣶⣤⣼⡞⠀⣰⢃⡞⡴⠃⢀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⠘⣦⢚⡽⠋⣟⣹⠟⠀⠀⢹⡏⠛⢧⣉⣷⣼⢣⢞⡜⠁⣠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢈⡗⠀⡾⢀⣠⡟⠳⡀⠀⠀⠀⣹⣦⠤⡾⢯⣁⢿⠏⢀⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⣰⠀⢯⠁⠀⠀⠹⣦⣀⡞⠉⠀⠀⠀⠀⠙⠃⠀⢯⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠁⡠⠊⠀⠀⠀⠁⠀⠀⠀⠀⠀⠉⢳⡀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡃⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⣿⡀⠀⢦⠀⠀⠀⢀⣀⣀⡀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⣸⠁⣀⠝⠀⡴⠊⠁⠀⣿⣿⣾⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⢀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⠁⠀⡜⠀⠀⠀⢀⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⣘⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⢸⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠈⢾⠀⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣾⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠈⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡇⠀⣀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⣸⣡⠞⠁⡀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠏⠀⢀⡔⠁⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⠈⠁⠀⠀⠐⠒⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠏⠀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⡀⠀⠀⠀⠀⠀⠈⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⡀⣀⠀⣠⣶⡿⠀⠀⠀⠀⠀⠀⠀⠀⠂⣠⡴⠋⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠯⣭⣉⣀⣀⣀⣀⣀⣠⡤⠴⠖⠋⢁⡤⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠀⠀⡴⠁⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠦⣤⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⣠⡏⠀⠀⠀⠀⠀""";
}