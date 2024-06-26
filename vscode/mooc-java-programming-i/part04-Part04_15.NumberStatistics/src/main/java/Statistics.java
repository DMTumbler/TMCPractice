public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = 0;
        if (count == 0) {
            return average;
        } else {
            average = Double.valueOf(sum) / Double.valueOf(count);
            return average;
        }
    }
}
