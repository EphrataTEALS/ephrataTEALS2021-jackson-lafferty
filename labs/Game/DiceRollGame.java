package labs.Game;
import java.util.*;

public class DiceRollGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome! In this game whoever reaches square 15 first wins! You can reach the square using two different moves, moving forward 3 squares or rolling a die to move forward the amount of squares that are on the die.");
        System.out.print("Player 1, enter your name: ");
        String p1 = in.nextLine();
        System.out.print("Player 2, enter your name: ");
        String p2 = in.nextLine();

        String activeP = " ";
        int p1Num = 0;
        int p2Num = 0;
        int max = 0;
        int turn = 0;
        boolean gameEnd = false;

        while (gameEnd = false) {
            while (max <= 15) {
            if (turn % 2 == 0) {
                activeP = p1;
            } else {
                activeP = p2;
            }

            Random rng = new Random();
            int roll = rng.nextInt(6) + 1;

            System.out.print(activeP + ", type 'move' to move 3 squares or type 'roll' to roll the die: ");
            String move = in.nextLine();
            if (move.equals("move") && activeP.equals(p1)) {
                p1Num += 3;
                System.out.println("You moved 3 spaces, your new total is: " + p1Num);
                turn++;
            } else if (move.equals("move") && activeP.equals(p2)) {
                p2Num += 3;
                System.out.println("You moved 3 spaces, your new total is: " + p2Num);
                turn++;
            } else if (move.equals("roll") && activeP.equals(p1)) {
                p1Num += roll;
                System.out.println("You rolled a " + roll + ", your new total is: " + p1Num);
                turn++;
            } else if (move.equals("roll") && activeP.equals(p2)) {
                p2Num += roll;
                System.out.println("You rolled a " + roll + ", your new total is: " + p2Num);
                turn++;
            } else {
                System.out.println("You entered an invalid value");
            }

            if (p1Num >= p2Num) {
                max = p1Num;
            } else if (p2Num >= p1Num) {
                max = p2Num;
            }
            
            }
        
        if (max == p1Num) {
            System.out.print("Congratulations " + p1 +", you won with a total of " + max + "!");
        } else if (max == p2Num) {
            System.out.print("Congratulations " + p2 +", you won with a total of " + max + "!");
        }

        System.out.print("Type 'y' if you want to restart the program, type 'n' if you want to exit");
        String decision = in.nextLine();
        if (decision.equals("n")) {
            gameEnd = true;
        } else {
            gameEnd = false;
            System.out.println("Goodbye!");
        }
    }
    in.close();
    } 
}