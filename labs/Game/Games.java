package labs.Game;
import java.util.*;

public class Games {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    boolean quit = false;

        while (quit == false) {
            System.out.print("What games would you like to play? Type 'dice', 'coin', or 'guessing'. You can also type 'quit' to quit: ");
            String game = in.nextLine();

            if (game.toLowerCase().equals("quit")) {
                quit = true;
                System.out.println("Goodbye!");
            } else if (game.toLowerCase().equals("coin")) {
                coinGame();
            } 
            else if (game.toLowerCase().equals("guessing")) {
                guessingGame();
            } 
            else if (game.toLowerCase().equals("dice")) {
                diceGame();
            } else {
            System.out.println("You entered an invalid input");
            }
        }
        in.close();
    }
    public static void diceGame() {
        Random rng = new Random();
        boolean win = false;
        
        System.out.println("In this game whoever reaches the entered space first will win. On your turn you can either move forward 3 spaces or roll a die and move forward the value displayed on the die.");

        System.out.print("Player 1, enter your name: ");
        String p1 = in.nextLine();
        System.out.print("Player 2, enter your name: ");
        String p2 = in.nextLine();

        System.out.print("Enter the amount of spaces you want to race to: ");
        int endSpace = in.nextInt();

        int activePNum = 0;
        String activeP = p1;

        int p1Space = 0;
        int p2Space = 0;

        String move = " ";

        while (win == false) {
            int roll = rng.nextInt(6) + 1;

            if (p1Space < endSpace && p2Space < endSpace) {

                System.out.print(activeP + ", type 'move' to move 3 spaces or type 'roll' to roll the die: ");
                move = in.nextLine();

                if (move.toLowerCase().equals("move") || move.toLowerCase().equals("roll")) {
                    int spaces = play(move, roll);
                    

                    if (activeP.equals(p1)) {
                        p1Space += spaces;
                        System.out.println(p1 + ", you moved forward " + spaces + " spaces and your new space is " + p1Space + ".");

                    } else if (activeP.equals(p2)) {
                        p2Space += spaces;
                        System.out.println(p2 + ", you moved forward " + spaces + " spaces and your new space is " + p2Space + ".");
                    }

                    activePNum += 1;
                    if (activePNum % 2 == 0) {
                        activeP = p1;

                    } else {
                        activeP = p2;
                    }

                } else {
                    System.out.println("You entered an invalid move.");
                }

            } else {
                activePNum -= 1;
                    if (activePNum % 2 == 0) {
                        activeP = p1;

                    } else {
                        activeP = p2;
                    }
                System.out.println(activeP + " won!");
                win = true;
                }
        }
    }

    public static int play(String move, int roll) {
        int result = 0;
        if (move.equals("move")) {
            result = 3;

        } else if (move.equals("roll")) {
            result = roll;
        }
        return result;
    }

    public static void coinGame() {
        Random rng = new Random();
        int coinFlip = 0;
        int guessNum = 0;
        int score = 0;
        boolean win = true;

        System.out.println("You will try to guess the coin flip the highest amount of times in a row.");

        while(win == true) {
            
            System.out.print("Guess 'heads' or 'tails': ");
            String guess = in.nextLine().toLowerCase();
            
            String coinSide = " ";
            coinFlip = rng.nextInt(2);

            if (coinFlip == 0) {
                coinSide = "heads";

            } else {
                coinSide = "tails";
            }

            guessNum = guessNumber(guess);

            if (guessNum == coinFlip) {
                score++;
                System.out.println("The coin was " + guess + "! You guessed correctly and your new score is: " + score);
            
            } else if (guessNum != coinFlip) {
                if (guessNum == 2) {
                System.out.println("You entered an invalid guess.");
                
                } else {
                    System.out.println("The coin was " + coinSide + "! You guessed incorrectly and your score is: " + score);
                    win = false;
                }
            }
        }
    }

        public static int guessNumber(String guess) {
            if (guess.toLowerCase().equals("heads")) {
                return 0;
            
            } else if (guess.toLowerCase().equals("tails")) {
                return 1;
            
            } else {
                return 2;
            }
        }

    public static void guessingGame() {
        Random rng = new Random();
        int guess = 0;
        int num = 1;
        int guesses = 0;
        boolean win = false;

        System.out.println("In this game you will try to guess the random number");

        System.out.println("There are 3 different difficulties. Easy (1-10), Medium (1-25), and Hard (1-50).");
        System.out.print("Choose your difficulty of 'easy', 'medium', or 'hard': ");
        String mode = in.nextLine();

        while (win == false) {
            if (mode.toLowerCase().equals("easy")) {
                num = rng.nextInt(10) + 1;

                while (guess != num) {
                    System.out.print("Enter your guess: ");
                    guess = in.nextInt();
                    if (!determine(guess, num).equals(" ")) {
                        System.out.println(determine(guess, num));
                    }
                    guesses++;
                }
                System.out.println("Congratulations! You guessed correctly in " + guesses + " guesses.");
                win = true;

            } else if (mode.toLowerCase().equals("medium")) {
                num = rng.nextInt(25) + 1;

                while (guess != num) {
                    System.out.print("Enter your guess: ");
                    guess = in.nextInt();
                    if (!determine(guess, num).equals(" ")) {
                        System.out.println(determine(guess, num));
                    }
                    guesses++;
                }
                System.out.println("Congratulations! You guessed correctly in " + guesses + " guesses.");
                win = true;

            } else if (mode.toLowerCase().equals("hard")) {
                num = rng.nextInt(50) + 1;

                while (guess != num) {
                    System.out.print("Enter your guess: ");
                    guess = in.nextInt();
                    if (!determine(guess, num).equals(" ")) {
                    System.out.println(determine(guess, num));
                    }
                    guesses++;
                }
                System.out.println("Congratulations! You guessed correctly in " + guesses + " guesses.");
                win = true;

            } else {
                System.out.println("You entered an invalid value.");
            }
        }
    }

    public static String determine(int guess, int num) {
        String result = " ";
        if (guess > num) {
            result = "Your guess is greater than the number.";
        } else if (guess < num) {
            result = "Your geuss is less than the number.";
        }
        return result;
    }
}