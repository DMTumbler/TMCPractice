import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;

    public TextUI(Scanner scanner, SimpleDictionary object) {
        this.scanner = scanner;
        this.object = object;
    }

    public void start() {
        String userInput, wordAdded, translation;
        while (true) {
            System.out.println("Command: ");
            userInput = this.scanner.nextLine();

            if (userInput.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (userInput.equals("add")) {
                System.out.println("Word: ");
                wordAdded = this.scanner.nextLine();

                System.out.println("Translation: ");
                translation = this.scanner.nextLine();

                this.object.add(wordAdded, translation);

            } else if (userInput.equals("search")) {
                System.out.println("To be translated: ");
                userInput = scanner.nextLine();
                translation = this.object.translate(userInput);

                if (translation == null) {
                    System.out.println("Word " + userInput + " was not found.");
                } else {
                    System.out.println(translation);
                }

            } else {
                System.out.println("Unknown Command");
            }

        }

    }

}
