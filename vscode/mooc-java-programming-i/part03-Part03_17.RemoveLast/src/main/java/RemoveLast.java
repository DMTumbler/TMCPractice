
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Word1");
        strings.add("Word2");
        strings.add("Word3");
        strings.add("Word4");
        strings.add("Word5");
        strings.add("Word6");
        System.out.println(strings);
        removeFirst(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }

    public static void removeFirst(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(0);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }
}
