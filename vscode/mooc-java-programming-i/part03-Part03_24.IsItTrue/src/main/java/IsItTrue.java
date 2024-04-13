
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        String userString;
        Scanner scanner = new Scanner(System.in);
        userString = scanner.nextLine();
        if (userString.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
