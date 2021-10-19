package labs.Scanners;
import java.util.*;

public class FindSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("What is the square of your entered integer?");
        int squareRoot = console.nextInt();
        int square = squareRoot * squareRoot;
        
        System.out.println("The square of " + squareRoot + " is " + square);
        console.close();
    }
}