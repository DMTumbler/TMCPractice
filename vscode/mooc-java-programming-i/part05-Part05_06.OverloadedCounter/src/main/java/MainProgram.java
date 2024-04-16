
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter);
        counter.increase();
        System.out.println(counter);
        counter.increase(2);
        System.out.println(counter);
        // Test your counter here
    }
}
