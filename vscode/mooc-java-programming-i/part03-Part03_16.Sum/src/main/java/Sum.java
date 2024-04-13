
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(9);
        list.add(6);
        list.add(22);
        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;
    }

}
