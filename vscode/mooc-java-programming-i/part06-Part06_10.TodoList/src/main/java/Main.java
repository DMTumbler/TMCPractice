
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            getRandomNumber(1, 20);
            count++;
        }
    }

    public static void getRandomNumber(int min, int max) {
        Random random = new Random();
        double randoms = Math.random();
        System.out.println(randoms);
        System.out.println(randoms + " * (" + max + " - " + min + ")" + " + " + min);
        String result = String.valueOf((int) (randoms * (max - min)) + min);
        System.out.println(result);
    }
}
