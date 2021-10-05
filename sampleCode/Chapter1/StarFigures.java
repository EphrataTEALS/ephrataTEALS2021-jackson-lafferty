public class StarFigures {

    public static void main(String[] args) {
        stars();
        stars();
    }

    public static void stars() {
        star();
        System.out.println();

        drawTenStars();
        System.out.println();

        drawLineOfStars();

        star();
    }

    public static void drawOneStar() {
        System.out.println("  *  ");
    }

    public static void drawTwoStars() {
        System.out.println(" * * ");
    }
    public static void drawLineOfStars() {
        drawOneStar();
        drawOneStar();
        drawOneStar();
    }

    public static void drawFiveStars() {
        System.out.println("*****");
    }
    public static void drawTenStars() {
        drawFiveStars();
        drawFiveStars();
    }
    public static void star() {
        drawTenStars();
        drawTwoStars();
        drawOneStar();
        drawTwoStars();
    }
}