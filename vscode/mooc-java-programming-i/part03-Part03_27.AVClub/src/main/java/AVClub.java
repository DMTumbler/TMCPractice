
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        String userInput = "empty";
        String[] parts;
        Scanner scanner = new Scanner(System.in);
        while (!(userInput.equals(""))) {
            userInput = scanner.nextLine();
            parts = userInput.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].contains("av")) {
                    System.out.println(parts[i]);
                }

            }
        }

    }
}
