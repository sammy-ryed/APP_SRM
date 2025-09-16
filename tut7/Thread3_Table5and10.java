public class Thread3_Table5and10 {
    public static void main(String[] args) {
        Thread t5 = new Thread(() -> {
            System.out.println("Table of 5:");
            for (int x = 1; x <= 10; x++) {
                System.out.println("5 x " + x + " = " + (5 * x));
                try { Thread.sleep(80); } catch (InterruptedException e) {}
            }
        });

        Thread t10 = new Thread(() -> {
            System.out.println("Table of 10:");
            for (int x = 1; x <= 10; x++) {
                System.out.println("10 x " + x + " = " + (10 * x));
                try { Thread.sleep(80); } catch (InterruptedException e) {}
            }
        });

        t5.start();
        t10.start();
        try { t5.join(); t10.join(); } catch (InterruptedException e) {}
    }
}
