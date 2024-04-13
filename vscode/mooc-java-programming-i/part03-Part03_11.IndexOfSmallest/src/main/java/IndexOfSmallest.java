
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = (Integer.valueOf(scanner.nextLine()));
            if (number == 9999) {
                break;
            }
            list.add(number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Your numbers are: " + list.get(i));
        }

        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Fount at index " + i);
            }
        }
    }
}
