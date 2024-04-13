
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int i = 0;
        for (i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        for (i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int i = 0;
        for (i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars((i * 2) - 1);
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printTriangle(4);
        // System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(20);
    }
}