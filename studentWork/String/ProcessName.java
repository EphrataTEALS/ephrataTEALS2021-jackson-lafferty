package studentWork.String;

import java.util.*;

public class ProcessName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your name: ");

        String input = in.nextLine();
        
        int sep = input.indexOf(" ") + 1;
        char firstLett = input.charAt(0);
        String last = input.substring(sep);
        
        System.out.println("Your name is: " + input);
        System.out.println("Your name is: " + last + ", " + firstLett + ".");
        
        in.close();
    }
}