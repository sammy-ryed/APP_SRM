class Student {
    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks, boolean isTeacher) {
        if (isTeacher) {
            this.marks = marks;
        } else {
            System.out.println("Only teachers can update marks");
        }
    }

    public String getName() {
        return name;
    }
}

public class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        s1.setMarks(85, true);
        System.out.println(s1.getName() + " Marks: " + s1.getMarks());
        s1.setMarks(90, false);
    }
}
