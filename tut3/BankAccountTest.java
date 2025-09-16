class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void displayBalance(){
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1001, "Rajesh", 25000);
        acc.displayBalance();
    }
}
