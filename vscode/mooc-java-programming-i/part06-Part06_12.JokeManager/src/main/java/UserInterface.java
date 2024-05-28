import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        String userInput = "";
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - adds a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                System.out.println("Write a joke to be added:");
                this.manager.addJoke(scanner.nextLine());
            }

            if (userInput.equals("2")) {
                System.out.println("Drawing a joke:");
                System.out.println(this.manager.drawJoke());
            }

            if (userInput.equals("3")) {
                System.out.println("Printing joke:");
                this.manager.printJokes();
            }
            if (userInput.equals("X")) {
                break;
            }
        }

    }
}
