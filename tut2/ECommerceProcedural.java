public class ECommerceProcedural {
    public static void main(String[] args) {
        double[] orders = {500.5, 1200.0, 750.25, 300.75};
        double total = 0;
        for(int x=0; x<orders.length; x++){
            total += orders[x];
        }
        System.out.println("Total Order Price = " + total);
    }
}
