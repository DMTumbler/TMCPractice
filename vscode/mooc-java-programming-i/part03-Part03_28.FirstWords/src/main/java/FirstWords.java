
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        String useString;
        String[] parts;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            useString = scanner.nextLine();
            if (useString.equals("")) {
                break;
            } else {
                parts = useString.split(" ");
                System.out.println(parts[0]);
            }
        }
    }
}
