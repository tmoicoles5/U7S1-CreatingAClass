package partA.ex01;

public class SavingAccountExample {
    public double balance; //double balance is a property
    public double interestRate = 0.01; // double interest rate is the doubles property
    public String name; //string name is a string property

    public void deposit(int x){
        balance += x;
    }

    public void displayCustomer(){ // the behaviors the objected reacts to in this program.
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
}
