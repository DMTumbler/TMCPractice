import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput = "";
        boolean validInput = false;
        PaymentCard chrisCard = new PaymentCard(200);
        System.out.println(chrisCard.balance());
        boolean wentThrough = chrisCard.takeMoney(250);
        if (!wentThrough) {
            System.out.println("Like I said. You's a poor fuck.");
        }
        System.out.println(chrisCard.balance());
        wentThrough = chrisCard.takeMoney(60);
        if (!wentThrough) {
            System.out.println("The");
        } else {
            System.out.println("Huh. You're not so poor after all.");
        }
        System.out.println(chrisCard.balance());
        PaymentTerminal cafe = new PaymentTerminal();
        int i = 0;
        while (i < 10) {
            double change = cafe.eatAffordably(10);
            System.out.println("The users change is " + change);
            System.out.println(cafe);
            change = cafe.eatHeartily(10);
            System.out.println("The users change is " + change);
            System.out.println(cafe);
            cafe.eatAffordably(chrisCard);
            System.out.println(chrisCard.balance());
            i++;
        }
        System.out.println("Would you like to deposit some money?");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine().toLowerCase();
        do {
            if (userInput.equals("yes") || userInput.equals("y")) {
                System.out.println("How much would you like to add?");
                if (scanner.hasNextDouble()) {
                    chrisCard.addMoney(Integer.valueOf(scanner.nextLine()));
                    System.out.println(chrisCard.balance());
                    validInput = true;
                } else {
                    System.out.println("That is not a valid amount. Please enter a valid amount.");
                    scanner.nextLine();
                }
            } else if (userInput.equals("no") || userInput.equals("n")) {
                System.out.println("Thank you! Bye!");
                validInput = true;
            } else {
                System.out.println("That is not a valid input. Enter a yes or no.");
                userInput = scanner.nextLine();
            }

        } while (!validInput);
    }
}
