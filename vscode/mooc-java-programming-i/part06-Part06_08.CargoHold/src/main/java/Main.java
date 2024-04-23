import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        // String userInput = scanner.nextLine();
        userInput = "First Book";
        Item book = new Item(userInput, 1);
        Item book2 = new Item("Second Book", 2);
        Item book3 = new Item("Third Book", 1);
        Item book4 = new Item("Fourth Book", 1);
        Item book5 = new Item("Fifth Book", 2);
        Item book6 = new Item("Sixth Book", 1);

        Suitcase suitcase = new Suitcase(10);
        Suitcase suitcase2 = new Suitcase(10);

        Hold hold = new Hold(20);

        suitcase.addItem(book);
        suitcase.addItem(book2);
        suitcase.addItem(book3);

        suitcase2.addItem(book4);
        suitcase2.addItem(book5);
        suitcase2.addItem(book6);

        System.out.println("Suitcase 1 contains: ");
        suitcase.printItems();
        System.out.println(suitcase);
        System.out.println("It's total weight is: " + suitcase.totalWeight());
        System.out.println("The heaviest item is: " + suitcase.heaviestItem());
        System.out.println();

        System.out.println("Suitcase 2 contains: ");
        suitcase.printItems();
        System.out.println(suitcase2);
        System.out.println("It's total weight is: " + suitcase2.totalWeight());
        System.out.println("The heaviest item is: " + suitcase2.heaviestItem());
        System.out.println();

        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        System.out.println(hold);
        System.out.println("\nThe suitcases in the hold contain the following items: ");
        hold.printItems();

    }

}
