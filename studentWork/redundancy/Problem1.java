package studentWork.redundancy;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        int a = 0;

        if (x < 30) {
            x++;
        }
        a = 2;
        System.out.println("Spongebob Squarepants! " + x);
        System.out.println(a);

        console.close();
    }
}