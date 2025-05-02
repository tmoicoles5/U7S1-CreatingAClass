package partA.ex01;

public class CheckingAccount {
    public long balance;

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public String name;

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
