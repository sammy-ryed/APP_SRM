
// Scenario 3: Employee Salary Calculation
class Employee {
    double baseSalary = 30000;
    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 10000;
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double overtimePay = 5000;
    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}
