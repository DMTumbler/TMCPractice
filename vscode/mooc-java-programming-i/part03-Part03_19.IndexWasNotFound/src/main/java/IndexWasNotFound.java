
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        int[] array = new int[10];
        array = fillArray();
        searchArray(array);
        // int[] array = new int[10];
        // array[0] = 6;
        // array[1] = 2;
        // array[2] = 8;
        // array[3] = 1;
        // array[4] = 3;
        // array[5] = 0;
        // array[6] = 9;
        // array[7] = 7;
    }

    public static void searchArray(int[] array) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Search for? ");
            int searching = Integer.valueOf(scanner.nextLine());
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (searching == array[i]) {
                    System.out.println(searching + " is at index " + i + ".");
                    found = true;
                }
            }
            if (found == false) {
                System.out.println(searching + " was not found.");
            }
        }
    }
    // Implement the search functionality here

    public static int[] fillArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

}
