
public class YourFirstAccount {

    public static void main(String[] args) {
        Account myAcount = new Account("Chris", 100);
        myAcount.deposit(20);
        System.out.println(myAcount.toString());
    }
}
