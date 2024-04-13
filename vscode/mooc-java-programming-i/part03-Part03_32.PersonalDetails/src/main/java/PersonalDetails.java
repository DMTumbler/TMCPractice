// Write a program that reads names and birth years from the user until an empty line is entered. 
//The name and birth year are separated by a comma.

// After that the program prints the longest name and the average of the birth years.
//If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
// Sample output

// sebastian,2017
// lucas,2017
// lily,2017
// hanna,2014
// gabriel,2009

// Longest name: sebastian
// Average of the birth years: 2014.8
// Sample output

// sauli,1948
// tarja,1943
// martti,1936
// mauno,1923
// urho,1900

// Longest name: martti
// Average of the birth years: 1930.0
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> counter = new ArrayList<>();
        String[] parts;
        String userData = "", name = "";
        int age = 0, largest = 0;
        double sum = 0;

        while (true) {
            userData = scanner.nextLine();
            if (userData.equals("")) {
                break;
            }
            parts = userData.split(",");
            userData = parts[0];
            names.add(userData);
            age = Integer.valueOf(parts[1]);
            ages.add(age);
        }
        name = names.get(0);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > name.length()) {
                name = names.get(i);
            }
        }
        for (int i = 0; i < ages.size() - 1; i++) {
            if (ages.get(i) > ages.get(i + 1)) {
                largest = ages.get(i);
            }
        }
        for (int i = 0; i < ages.size(); i++) {
            sum += ages.get(i);
        }
        double average = sum / ages.size();
        System.out.println("name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
