package labs.Scanners;
import java.util.*;

public class MusicGroup {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your favorite music group?");
        String favoriteGroup = console.nextLine();

        System.out.println("My favorite music group is " + favoriteGroup);
        console.close();
    }
}