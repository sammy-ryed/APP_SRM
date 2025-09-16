class Mobile {
    String brand;
    String model;
    double price;
    Mobile(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void showDetails(){
        System.out.println(brand + " " + model + " " + price);
    }
}

public class MobileTest {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S24", 80000);
        Mobile m2 = new Mobile("Apple", "iPhone 15", 120000);
        Mobile m3 = new Mobile("OnePlus", "12R", 45000);
        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}
