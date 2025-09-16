class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
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

public class Q1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("A", new int[]{80, 90, 85}),
            new Student("B", new int[]{70, 75, 72}),
            new Student("C", new int[]{95, 88, 92})
        };

        Student top = students[0];
        for (int x = 1; x < students.length; x++) {
            if (students[x].average() > top.average()) {
                top = students[x];
            }
        }
        System.out.println("Top student: " + top.name + " Avg: " + top.average());
    }
}
