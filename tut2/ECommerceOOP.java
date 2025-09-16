class Order {
    double price;
    Order(double price){
        this.price = price;
    }
    double getPrice(){
        return price;
    }
}

public class ECommerceOOP {
    public static void main(String[] args) {
        Order[] orders = {new Order(500.5), new Order(1200.0), new Order(750.25), new Order(300.75)};
        double total = 0;
        for(int x=0; x<orders.length; x++){
            total += orders[x].getPrice();
        }
        System.out.println("Total Order Price = " + total);
    }
}
