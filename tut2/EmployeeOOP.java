class Employee {
    double salary;
    Employee(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }
}

public class EmployeeOOP {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(35000.5), new Employee(42000.0), new Employee(28000.75), new Employee(50000.25)};
        double max = employees[0].getSalary();
        for(int x=1; x<employees.length; x++){
            if(employees[x].getSalary() > max){
                max = employees[x].getSalary();
            }
        }
        System.out.println("Highest Salary = " + max);
    }
}
