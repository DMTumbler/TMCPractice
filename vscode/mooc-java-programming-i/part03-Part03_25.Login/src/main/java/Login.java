
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        if ((username.equals("alex") || username.equals("emma")) && (password.equals("sunshine")
                || password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
