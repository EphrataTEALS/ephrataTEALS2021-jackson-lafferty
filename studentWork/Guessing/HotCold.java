package studentWork.Guessing;
import java.util.Scanner;

public class HotCold {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    int count = 0;

    String input = "";

    while (!input.equals("correct")) {
        System.out.print("Enter hotter, colder, or correct: ");
        input = in.next().toLowerCase();

        if (input.equals("hotter") || input.equals("colder")) {
            count++;
            System.out.println("You entered " + input + ".");
        } else if (input.equals("correct")) {
            count++;
            System.out.println("You are correct! It took you " + count + " guesses.");
        } else {
            System.out.println("You did not enter a valid input.");
        }
    }
    in.close();
    }
}