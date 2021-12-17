package studentWork.parameters;
import java.util.*;

public class HotChocolate {
    public static void main(String[] args) {
        Scanner beverage = new Scanner(System.in);
        Scanner add = new Scanner(System.in);

        System.out.print("What do you want?  Hot Chocolate or Coffee? ");
        String drink = beverage.nextLine();

        if (drink.equalsIgnoreCase("Coffee")) {
            System.out.println("Pick something better!");
        }
        else if (drink.equalsIgnoreCase("Hot Chocolate")) {
            System.out.print("Add something to it? Cream, Spice, Sweet, Plain? ");
            String additem = add.next();
            System.out.println(Extra(additem));
        }
        else {
            System.out.println("Your're Not Thirsty");
        }

        add.close();
        beverage.close();
    }

    public static String Extra(String add) {
        Scanner addto = new Scanner(System.in);

        if (add.equalsIgnoreCase("Cream")) {
            System.out.print("Add Ice Cream, Marshmallows, Peanut Butter: ");
            String additem = addto.nextLine();
            addto.close();
            return "You ordered Hot Chocolate with " + additem;
        }
        if (add.equalsIgnoreCase("Spice")) {
            System.out.print("Add Cinnamon, Espresso, Peppermint: ");
            String additem = addto.nextLine();
            addto.close();
            return "You ordered Hot Chocolate with " + additem;
        }
        if (add.equalsIgnoreCase("Sweet")) {
            System.out.print("Add Caramel, Chocolate, Orange: ");
            String additem = addto.nextLine();
            addto.close();
            return "You ordered Hot Chocolate with " + additem;
        }
        else {
            addto.close();
            return "You ordered Plain Hot Chocolate";
        }
    }
}