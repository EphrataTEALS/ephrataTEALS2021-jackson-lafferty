package studentWork.redundancy;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        
        int b = 5;

        b = b - x;

        if (x % 3 <= 0) {
            x = b;
        } else if (x % 3 == 1) {
            x = 7;
        } else {
            x += 3;
        }
        System.out.println("The final values are " + b + " and " + x);

        console.close();
    }
}
