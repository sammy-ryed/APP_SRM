class Account {
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
}

public class BankingOOP {
    public static void main(String[] args) {
        Account[] accounts = {new Account(1000.5), new Account(2500.75), new Account(3000.0), new Account(1500.25)};
        double total = 0;
        for(int x=0; x<accounts.length; x++){
            total += accounts[x].getBalance();
        }
        System.out.println("Total Balance = " + total);
    }
}
