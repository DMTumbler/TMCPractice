import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<String> list;

    public ExerciseManagement() {
        this.list = new ArrayList<>();

    }

    public ArrayList<String> exerciseList() {
        return this.list;
    }

    public void add(String string) {
        this.list.add(string);
    }

}
