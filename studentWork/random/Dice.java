package studentWork.random;
import java.util.Random;

public class Dice {
    public static void main(String[] Args) {
    
    Random rand = new Random();
    int diceRoll = rand.nextInt(6) + 1;
    
    System.out.println("Roll is: " + diceRoll);
    }
}