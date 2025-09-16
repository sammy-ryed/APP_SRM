class Employee {
    int id;
    String name;
    int[] salaries;

    Employee(int id, String name, int[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    int totalSalary() {
        int sum = 0;
        for (int x = 0; x < salaries.length; x++) {
            sum += salaries[x];
        }
        return sum;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee(1, "A", new int[]{1000, 1200, 1100, 1150, 1300, 1400}),
            new Employee(2, "B", new int[]{1500, 1400, 1600, 1550, 1500, 1700}),
            new Employee(3, "C", new int[]{900, 950, 1000, 1100, 1200, 1250})
        };

        Employee top = emps[0];
        for (int x = 1; x < emps.length; x++) {
            if (emps[x].totalSalary() > top.totalSalary()) {
                top = emps[x];
            }
        }
        System.out.println("Highest salary: " + top.name + " " + top.totalSalary());
    }
}
