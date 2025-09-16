class Student2 {
    String name;
    int[] marks;

    Student2(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int x = 0; x < marks.length; x++) {
            sum += marks[x];
        }
        return (double) sum / marks.length;
    }
}

class Department {
    String departmentName;
    Student2[] students;

    Department(String departmentName, Student2[] students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    double departmentAverage() {
        double total = 0;
        for (int x = 0; x < students.length; x++) {
            total += students[x].average();
        }
        return total / students.length;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Department[] depts = {
            new Department("CS", new Student2[]{new Student2("A", new int[]{80, 90}), new Student2("B", new int[]{70, 75})}),
            new Department("Math", new Student2[]{new Student2("C", new int[]{95, 88}), new Student2("D", new int[]{85, 80})})
        };

        Department best = depts[0];
        for (int x = 1; x < depts.length; x++) {
            if (depts[x].departmentAverage() > best.departmentAverage()) {
                best = depts[x];
            }
        }
        System.out.println("Best Department: " + best.departmentName + " Avg: " + best.departmentAverage());
    }
}
