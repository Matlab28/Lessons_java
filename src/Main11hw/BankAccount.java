package Main11hw;

public class BankAccount {
    static int counter = 0;

    String name;

    int totalAmount;

    public BankAccount(String name, int totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
        counter++;
    }
}
