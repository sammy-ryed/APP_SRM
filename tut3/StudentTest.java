class Student {
    int rollNo;
    String name;
    int marks;
    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anjali", 85);
        Student s2 = new Student(2, "Rohit", 90);
        s1.display();
        s2.display();
    }
}
