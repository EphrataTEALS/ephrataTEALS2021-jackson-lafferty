public class FightOn {
    public static void main(String[] args) {
        fightSongMulti();
        fightSongMulti();
        fightSong();
    }
    public static void fightSongMulti() {
        fightSong();
        fightSong();
    }
    public static void fightSong() {
        fight();
        System.out.println("Fight on, fight on, we'll show our Tiger's might");
        victory();
        fight();
        System.out.println();
        System.out.println("E-P-H-R-A-T-A");
        victory();
        fight();
        System.out.println();

    }
    
    public static void fight() {
        System.out.println("Fight on, fight on, Ephrata Tigers fight");
    }

    public static void victory() {
        System.out.println("Fight on, fight on, It's victory tonight");
    }
}