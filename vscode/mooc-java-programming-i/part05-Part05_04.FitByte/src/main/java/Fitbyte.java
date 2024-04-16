public class Fitbyte {
    private double age, restHeartRate;

    public Fitbyte(int age, int restHeartRate) {
        this.age = age;
        this.restHeartRate = restHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (maxHeartRate(this.age) - this.restHeartRate) * (percentageOfMaximum) + this.restHeartRate;
    }

    public double maxHeartRate(double age) {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return String.valueOf(maxHeartRate(age));
    }
}
