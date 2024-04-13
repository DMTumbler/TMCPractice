
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        String userString = "Start";
        String[] parts;
        System.err.println();
        Scanner scanner = new Scanner(System.in);
        while (!(userString.equals(""))) {
            userString = scanner.nextLine();
            parts = userString.split(" ");
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }

        }

    }
}
