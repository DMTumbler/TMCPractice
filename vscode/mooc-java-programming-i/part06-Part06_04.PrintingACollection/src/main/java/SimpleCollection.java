
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String names = "", present = "";
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        present = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        if (elements.size() == 1) {
            present = "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            return present + elements.get(0);
        }

        for (String name : elements) {
            names += name + "\n";
        }

        return present + names;

    }

}
