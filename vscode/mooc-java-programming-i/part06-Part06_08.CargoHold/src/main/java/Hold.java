import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> scList;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.scList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(suitcase.totalWeight() > maxWeight)) {
            scList.add(suitcase);
        } else {
            System.out.println("The suitcase surpasses the holds weight limit");
        }
    }

    public void printItems() {
        for (Suitcase suitcase : scList) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int weight = 0;
        for (Suitcase suitcase : scList) {
            weight += suitcase.totalWeight();
        }

        if (scList.isEmpty()) {
            return "The hold is empty." + "(" + weight + " kg)";
        }

        if (scList.size() == 1) {
            return scList.size() + " suitcase " + "(" + weight + " kg)";
        }
        return scList.size() + " suitcases " + "(" + weight + " kg)";
    }

}
