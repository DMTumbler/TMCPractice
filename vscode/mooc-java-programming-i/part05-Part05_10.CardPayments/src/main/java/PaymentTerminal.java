
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double cost = 2.50, change = 0;
        if (payment >= cost) {
            change = payment - cost;
            this.money += cost;
            this.affordableMeals++;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double cost = 4.30, change = 0;
        if (payment >= cost) {
            change = payment - cost;
            this.money += cost;
            this.heartyMeals++;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double cost = 2.50;
        if (card.balance() >= cost) {
            card.takeMoney(cost);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double cost = 4.30;
        if (card.balance() >= cost) {
            card.takeMoney(cost);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            if (this.money > 0 || this.money > sum) {
                card.addMoney(sum);
                this.money += sum;
            }
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
