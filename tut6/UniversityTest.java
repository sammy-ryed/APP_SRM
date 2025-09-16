
// Scenario 5: University Admission
class Admission {
    void admissionProcess() {
        System.out.println("General admission process.");
    }
}

class UndergraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

class PostgraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        Admission a1 = new UndergraduateAdmission();
        Admission a2 = new PostgraduateAdmission();
        a1.admissionProcess();
        a2.admissionProcess();
    }
}
