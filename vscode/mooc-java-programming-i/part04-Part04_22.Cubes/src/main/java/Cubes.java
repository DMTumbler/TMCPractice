
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        String value = "";
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }
            System.out.println(result = Integer.valueOf(value) * Integer.valueOf(value) * Integer.valueOf(value));
            ;
        }
    }
}
