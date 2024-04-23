import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.itemList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int currentWeight = 0;
        while (currentWeight < maxWeight) {
            if (this.itemList.contains(item)) {
                System.out.println("This item is already on the list.");
                break;
            } else {
                if (item.getWeight() + currentWeight <= this.maxWeight) {
                    this.itemList.add(item);
                    currentWeight += item.getWeight();
                } else {
                    System.out.println("This item is too heavy and cannot be added.\n");
                    break;
                }
            }
        }

    }

    public void printItems() {
        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : itemList) {
            weight += item.getWeight();
        }
        return weight;
    }

    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }

        Item switcher = this.itemList.get(0);
        for (Item item : itemList) {
            if (switcher.getWeight() < item.getWeight()) {
                switcher = item;
            }
        }
        return switcher;

    }

    @Override
    public String toString() {
        int weight = 0;
        for (Item item : itemList) {
            weight += item.getWeight();
        }
        if (itemList.size() == 1) {
            return this.itemList.size() + " item " + "(" + weight + " kg)";
        }
        if (itemList.isEmpty()) {
            return "no items " + "(" + weight + " kg)";
        }
        return this.itemList.size() + " items " + "(" + weight + " kg)";
    }

}
