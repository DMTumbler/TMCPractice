public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " (" + this.weight + ")";

    }
}
