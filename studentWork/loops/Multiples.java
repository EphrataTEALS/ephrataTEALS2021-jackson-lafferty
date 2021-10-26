package studentWork.loops;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        System.out.print("Enter a number ");

        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        for(int i = 1; i < 11; i += 1) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
     System.out.println("The Iteration is Complete");
     console.close();
    }
}