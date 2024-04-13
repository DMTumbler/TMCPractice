
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        printNumbersInRange(list, 4, 10);
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(54);
        list.add(12);
        list.add(7);
        list.add(5);
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 5);
        System.out.println("The numbers in the range [3.10]");
        printNumbersInRange(list, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int value : numbers) {
            if (value >= lowerLimit && value <= upperLimit) {
                System.out.println(value);
            }
        }
    }

}
