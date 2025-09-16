class Car {
    String brand;
    String model;
    int year;
    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void start(){
        System.out.println("Car is starting...");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Fortuner", 2023);
        c.start();
    }
}
