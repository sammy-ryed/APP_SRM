public class BankingProcedural {
    public static void main(String[] args) {
        double[] balances = {1000.5, 2500.75, 3000.0, 1500.25};
        double total = 0;
        for(int x=0; x<balances.length; x++){
            total += balances[x];
        }
        System.out.println("Total Balance = " + total);
    }
}
