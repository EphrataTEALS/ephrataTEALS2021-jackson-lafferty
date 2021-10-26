package labs.Scanners;
import java.util.*;

public class DriveRentCar {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    System.out.print("Enter the age of a person as a integer between 1 and 70: ");
    int age = console.nextInt();
    
    if (age >= 16 && age < 25) {
        System.out.println("Can drive but can't rent a car.");
    } else if (age >= 25) {
        System.out.println("Can drive and can rent a car.");
    } else {
        System.out.println("Can’t drive and can’t rent a car");
    }
    console.close();
    }
}