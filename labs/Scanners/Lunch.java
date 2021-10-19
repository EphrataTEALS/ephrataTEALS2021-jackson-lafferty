package labs.Scanners;
import java.util.*;

public class Lunch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How much did you pay for lunch at your favorite restaurant?");
        double moneySpent = console.nextDouble();

        System.out.println("I paid $" + moneySpent + " for my lunch.");
        console.close();
    }
}