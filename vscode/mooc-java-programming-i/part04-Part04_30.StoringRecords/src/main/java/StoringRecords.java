
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        String line = "", name = "";
        int age = 0, i = 0;
        String[] parts;
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                parts = line.split(",");
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                persons.add(new Person(name, age));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return persons;

    }
}
