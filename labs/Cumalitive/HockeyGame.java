package labs.Cumalitive;
import java.util.*;

public class HockeyGame {
    public static void main(String[] args) {
        
        Scanner team = new Scanner(System.in);
        Scanner periods = new Scanner(System.in);
        
        System.out.println("What Teams are playing? ");
        System.out.println("Home Team: ");
        String team1 = team.next();
        System.out.println("Away Team: ");
        String team2 = team.next();

        System.out.println("How many periods have been played so far? ");
        int periodsPlayed = periods.nextInt();

        System.out.println(TotalGoals(team1, periodsPlayed));
        System.out.println();
        System.out.println(TotalGoals(team2, periodsPlayed));

        team.close();
        periods.close();
    }

        public static String TotalGoals(String teamName, int periods) {
            
            int sum = 0;
            double average = 0.0;
            Scanner hstat = new Scanner(System.in);
            for (int i=1; i <= periods; i++) {
                System.out.println("The " + teamName + " scored how many goals at the end of the " + i + " period? ");
                int value = hstat.nextInt();
                sum += value;
                average = sum/(double)periods;
            }

            hstat.close();
            return "The " + teamName + " have " + sum + " goals and an average of " + average + " goals per period";
    }
}