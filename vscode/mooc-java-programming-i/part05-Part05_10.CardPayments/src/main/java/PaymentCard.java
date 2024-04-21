
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (amount > this.balance) {
            System.out.println("Your balance is too low.");
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
