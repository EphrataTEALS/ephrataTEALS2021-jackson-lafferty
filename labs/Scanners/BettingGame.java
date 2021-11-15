package labs.Scanners;
import java.util.*;

public class BettingGame {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);                //setting scanner/random
        Random rng = new Random();
        
        int money = 100;                                   //setting intial money/bet/prediction/flip/rounds
        int bet = 0;
        int prediction = 0;
        int flip = 0;
        int rounds = 5;

        System.out.println("You will start with $" + money + ".\nTry to double your amount in 5 rounds by betting on a coin!\nEach successful bet will add the amount you bet to your total money.");

        for (int i = 0; i < rounds; i++) {
            System.out.print("Your bet amount: ");                              //setting bet amount
            bet = in.nextInt();

            System.out.print("Your prediction (1 = heads, 2 = tails): ");       //setting user's prediction
            prediction = in.nextInt();

            flip = rng.nextInt(2) + 1;                                          //flipping the coin

            if (money == 0) {                                                   //conditions for bet
                System.out.println("You have no money to bet. Game Over!");
                i = rounds;
            } else if (bet < 1 || bet > money) {
                System.out.println("Not a valid betting amount, restarting the round.");
                rounds++;
            } else { 
                if (prediction != 1 && prediction != 2) {                                       //determines if you lost/won the flip
                    System.out.println("Not a valid bet, restarting the round.");
                    rounds++;
                }
                else if (prediction == flip) {
                    money += bet;
                    System.out.println("You won the coin flip! Your new amount is: $" + money + "!");
                } else {
                    money -= bet;
                    System.out.println("You lost the coin flip! Your new amount is: $" + money + "!");
                    if (money == 0) {
                        System.out.println("You have no money to bet. Game Over!");
                        i = rounds;
                    }
                }
            }
        }                                                                                       //determines if you won/lost game
        if (money >= 200) {
            System.out.println("Congratulations! You won with a total amount of: $" + money + "!");
        } else {
            System.out.println("You lost with a total amount of: $" + money + "!");
        }
        in.close();
    }
}