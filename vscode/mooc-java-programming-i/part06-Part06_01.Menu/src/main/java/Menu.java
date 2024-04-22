
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        } else {
            System.out.println("This is already on the menu.");
        }
    }

    public void printMeals() {
        if (!meals.isEmpty()) {
            for (String meal : this.meals) {
                System.out.println(meal);
            }
        }
    }

    public void clearMenu() {
        this.meals.removeAll(meals);
    }
}
