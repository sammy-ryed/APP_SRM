class Account {
    int accountNumber;
    double[] transactions;

    Account(int accountNumber, double[] transactions) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    double maxDeposit() {
        double max = transactions[0];
        for (int x = 1; x < transactions.length; x++) {
            if (transactions[x] > max) {
                max = transactions[x];
            }
        }
        return max;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(101, new double[]{1000, 2000, 1500}),
            new Account(102, new double[]{5000, 3000, 2500}),
            new Account(103, new double[]{800, 900, 700})
        };

        Account best = accounts[0];
        for (int x = 1; x < accounts.length; x++) {
            if (accounts[x].maxDeposit() > best.maxDeposit()) {
                best = accounts[x];
            }
        }
        System.out.println("Account with largest deposit: " + best.accountNumber + " " + best.maxDeposit());
    }
}
