package labs.Loops;
import java.util.Scanner;

public class NestedMultiples {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);      /* determines size of table */
        System.out.print("Size of table: ");
        
        int size = console.nextInt();
        
        for (int row = 1; row <= size; row++) {        /* nested loop that makes table */
            for (int col = 1; col <=size; col++) {
                int product = row * col;
                System.out.print(product + "\t");
            }
            System.out.println();
        }
        console.close();
    }
}