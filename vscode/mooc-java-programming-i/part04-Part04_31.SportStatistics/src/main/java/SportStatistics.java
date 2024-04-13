
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        String line = "", file = "", team1 = "", team2 = "", userSearch = "";
        int score1 = 0, score2 = 0, count = 0, wins = 0, losses = 0;
        Scanner scan = new Scanner(System.in);
        String[] parts;
        System.out.println("File: ");
        file = scan.nextLine();
        System.out.println("Team:");
        userSearch = scan.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                parts = line.split(",");
                team1 = parts[0];
                team2 = parts[1];
                score1 = Integer.valueOf(parts[2]);
                score2 = Integer.valueOf(parts[3]);
                if (team1.contains(userSearch) || team2.contains(userSearch)) {
                    count++;
                }
                if (team1.contains(userSearch) && score1 > score2) {
                    wins++;
                } else if (team2.contains(userSearch) && score2 > score1) {
                    wins++;
                } else if (team1.contains(userSearch) && score1 < score2) {
                    losses++;
                } else if (team2.contains(userSearch) && score2 < score1) {
                    wins++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
