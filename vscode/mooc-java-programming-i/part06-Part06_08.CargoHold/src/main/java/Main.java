import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        // String userInput = scanner.nextLine();
        userInput = "First Book";
        Item book = new Item(userInput, 12);
        System.out.println(book.getName());

        System.out.println(book.getWeight());
        System.out.println(book);

    }

}
