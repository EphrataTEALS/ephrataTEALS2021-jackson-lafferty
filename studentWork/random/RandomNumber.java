package studentWork.random;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rng = new Random();
        int randNum = rng.nextInt(10);

        if (randNum % 2 == 0) {
            System.out.println(randNum + " (even)");
        } else {
            System.out.println(randNum + " (odd)");
        }
    }
}