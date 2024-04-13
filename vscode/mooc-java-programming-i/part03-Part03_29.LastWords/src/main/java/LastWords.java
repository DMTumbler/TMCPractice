
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String useString;
        String[] parts;
        while (true) {
            useString = scanner.nextLine();
            if (useString.equals("")) {
                break;
            } else {
                parts = useString.split(" ");
                System.out.println(parts[parts.length - 1]);
            }
        }
    }
}