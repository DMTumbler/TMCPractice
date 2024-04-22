
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String id, name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier?");
            id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name?");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive item = new Archive(id, name);
            if (!archive.contains(item)) {
                archive.add(item);
            }

        }

        for (Archive items : archive) {
            System.out.println(items);
        }
    }
}