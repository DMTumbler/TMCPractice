
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();
        while (timer.getMillseconds() < 99) {
            timer.advance();
            System.out.println(timer);
        }
        while (timer.getSeconds() < 59) {
            timer.advance();
            System.out.println(timer);
        }
        while (timer.getMillseconds() < 99) {
            timer.advance();
            System.out.println(timer);
        }
    }
}
