class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    int roomNumber;

    InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

class OutPatient extends Patient {
    OutPatient(String name, int age) {
        super(name, age);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        InPatient ip = new InPatient("Ravi", 40, 101);
        OutPatient op = new OutPatient("Sita", 30);
        ip.showDetails();
        op.showDetails();
    }
}
