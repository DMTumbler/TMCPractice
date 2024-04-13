
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        String name = "", line = "";
        String[] parts;
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        name = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(name))) {
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                parts = line.split(",");
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + age + " years");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
