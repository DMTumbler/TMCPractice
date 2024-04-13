
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true) {
            System.out.println("Name: ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Item(name));
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
