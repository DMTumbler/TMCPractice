public class Timer {
    private ClockHand seconds;
    private ClockHand miliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.miliseconds = new ClockHand(100);
    }

    public void advance() {
        this.miliseconds.advance();
        if (this.miliseconds.getValue() == 0) {
            this.seconds.advance();
        }
    }

    public int getMillseconds() {
        return this.miliseconds.getValue();
    }

    public int getSeconds() {
        return this.seconds.getValue();
    }

    public String toString() {
        return seconds.toString() + ":" + miliseconds.toString();
    }

}
