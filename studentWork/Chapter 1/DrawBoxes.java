public class DrawBoxes {
    public static void fourBox(String[] args) {
        twoBox();
        twoBox();
    }
    public static void threeBox() {
        twoBox();
        oneBox();
    }
    public static void twoBox() {
        oneBox();
        oneBox();
    }
    public static void oneBox() {
        horizontal();
        vertical();
        horizontal();
    }
    public static void horizontal() {
        System.out.println("+----+");
    }
    public static void vertical() {
        System.out.println("|    |");
    }
}