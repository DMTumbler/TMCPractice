
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("What indices would you like to swap?");
        System.out.println("Enter your first value:");
        int index1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter your second value:");
        int index2 = Integer.valueOf(scanner.nextLine());
        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
        System.out.println("");

        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
