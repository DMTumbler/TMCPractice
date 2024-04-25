import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        String userInput;
        while (true) {
            System.out.println("Command: ");
            userInput = scanner.nextLine();
            if (userInput.equals("stop")) {
                break;

            } else if (userInput.equals("add")) {
                System.out.println("To add: ");
                userInput = scanner.nextLine();
                this.list.add(userInput);

            } else if (userInput.equals("list")) {
                list.print();

            } else if (userInput.equals("remove")) {
                System.out.println("Which one removed.");
                userInput = scanner.nextLine();
                this.list.remove(Integer.valueOf(userInput));

            } else {
                System.out.println("This command is not recognized.");
            }

        }
    }

}
