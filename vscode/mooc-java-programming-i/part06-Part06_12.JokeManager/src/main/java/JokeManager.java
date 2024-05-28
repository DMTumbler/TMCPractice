import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();

    }

    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing jokes:");

        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";

        }

        int index = 0;
        String joke = "";
        Random draw = new Random();
        index = draw.nextInt(jokeList.size());
        joke = jokeList.get(index);
        return joke;
    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        for (String joke : jokeList) {
            System.out.println(joke);
        }
    }
}
