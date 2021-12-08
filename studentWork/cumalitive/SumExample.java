package studentWork.cumalitive;
import java.util.*;

public class SumExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to add: ");
        int numbersToAdd = in.nextInt();
        int sum = 0;
        int evenSum = 0;

        for (int i = 0; i < numbersToAdd; i++) {
            System.out.print("What is the number you would like to add: ");
            int value = in.nextInt();
            sum += value;
            if (value % 2 == 0) {
                evenSum += value;
            }
        }
        double average = sum / (double)numbersToAdd;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The sum of even numbers is " + evenSum);

    in.close();
    }
}