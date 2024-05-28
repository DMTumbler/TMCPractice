
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String test = "";
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface interface1 = new UserInterface(manager, scanner);
        manager.addJoke("This is a test.");
        manager.addJoke("This is another test.");

        test = manager.drawJoke();

        System.out.println(test);
        System.out.println();

        manager.printJokes();

        interface1.start();

    }
}
