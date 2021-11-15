package studentWork.random;
import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);                           //setting scanner/random
        Random rng = new Random();

        int cNum = rng.nextInt(10) + 1;                                     //setting cNum
        int uNum = 0;

        String win = ("false");                                             //setting win variable

        while (!win.equals("true")) {
        
        System.out.print("Guess a number 1-10: ");                          //settting uNum
        uNum = console.nextInt();

            if (uNum > cNum) {                                              //if uNum is less than, greater than, or equal to cNum
                System.out.println("The number is less than your guess!");
        
            } else if (uNum < cNum) {
                System.out.println("The number is greater than your guess!");
        
            } else if (uNum == cNum) {
                System.out.println("You guessed correctly");
                win = ("true");
            } else {
                System.out.println("Your guess is not valid");
            }
        }
        console.close();
    }
}