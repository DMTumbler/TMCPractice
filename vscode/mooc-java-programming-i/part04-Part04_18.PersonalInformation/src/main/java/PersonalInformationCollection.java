
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        String firstName = "", lastName = "", id = "";
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            if (firstName.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        for (PersonalInformation each : infoCollection) {
            System.out.println(each.getFirstName() + " " + each.getLastName());
        }
    }
}
