
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try (Scanner setName = new Scanner(System.in)) {
            String fileName = "";
            fileName = setName.nextLine();
            try (Scanner scanner = new Scanner(Paths.get(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            } catch (Exception e) {
            }
        }
    }
}
