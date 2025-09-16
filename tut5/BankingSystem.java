abstract class Account {
    String accountNumber;
    abstract void calculateInterest();
}

class Savings extends Account {
    void calculateInterest() {
        System.out.println("Savings Account Interest Calculated");
    }
}

class Current extends Account {
    void calculateInterest() {
        System.out.println("Current Account Interest Calculated");
    }
}

class Loan extends Account {
    void calculateInterest() {
        System.out.println("Loan Account Interest Calculated");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account a1 = new Savings();
        Account a2 = new Current();
        Account a3 = new Loan();
        a1.calculateInterest();
        a2.calculateInterest();
        a3.calculateInterest();
    }
}
