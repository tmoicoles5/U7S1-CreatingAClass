package partA.ex02;

public class SavingBond {
    public int interestRate;
    public double investment;
    public int term;
    public double profit;


    public double Buy(int term) {
        double monthlyRate = interestRate / 100.0;
        for (int i = 0; i < term; i++) {
            profit += investment * monthlyRate;
        }

        if (term >= 1 && term <= 11) {
            return 0.5;
        } else if (term >= 12 && term <= 23) {
            return 1.0;
        } else if (term >= 24 && term <= 35) {
            return 1.5;
        } else if (term >= 36 && term <= 47) {
            return 2.0;
        } else {
            return 2.5;
        }
    }



    public void displaySavingsBond() {
        System.out.println("Investment Amount : $" + investment);
        System.out.println("Terms(months):" + term);
        System.out.println("Interest Rate : " + interestRate + "% per month");
        System.out.println("Total Profit: $" + profit);
        System.out.println("Final Amount: $" + (investment + profit));

    }

}