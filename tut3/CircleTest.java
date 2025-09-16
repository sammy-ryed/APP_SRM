class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return 3.14159 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area = " + c.calculateArea());
    }
}
