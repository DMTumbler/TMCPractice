import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title = "", pages = "", year = "";
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            pages = scanner.nextLine();
            System.out.println("Publication year: ");
            year = scanner.nextLine();
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (answer.equals("name")) {
            System.out.println();
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else if (answer.equals("pages")) {
            System.out.println();
            for (Book book : books) {
                System.out.println(book.getPages());
            }
        } else if (answer.equals("year")) {
            System.out.println();
            for (Book book : books) {
                System.out.println(book.getYear());
            }
        }
    }

}
