
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        String personAndAge;
        String[] parts;
        String name = "none";
        Scanner scanner = new Scanner(System.in);
        int largest = 0, value = 0;
        while (true) {
            personAndAge = scanner.nextLine();
            if (personAndAge.equals("")) {
                break;
            }
            parts = personAndAge.split(",");
            value = Integer.valueOf(parts[1]);
            for (int i = 0; i < parts.length; i++) {
                if (value > largest) {
                    largest = value;
                    name = parts[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
