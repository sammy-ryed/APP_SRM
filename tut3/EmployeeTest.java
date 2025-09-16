class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, 50000);
        Employee e2 = new Employee("Riya", 102, 60000);
        e1.display();
        e2.display();
    }
}
