public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public void increase() {
        increase(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int deacreaseBy) {
        if (deacreaseBy > 0) {
            this.value = this.value - deacreaseBy;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        return "The value is " + value;
    }
}
