public class Thread2_OddEven {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread even = new Thread(() -> {
            for (int x = 2; x <= 10; x += 2) {
                synchronized (lock) {
                    System.out.println("Even: " + x);
                    lock.notify();
                    try {
                        if (x < 10) lock.wait();
                    } catch (InterruptedException e) {}
                }
            }
        });

        Thread odd = new Thread(() -> {
            for (int x = 1; x <= 9; x += 2) {
                synchronized (lock) {
                    System.out.println("Odd: " + x);
                    lock.notify();
                    try {
                        if (x < 9) lock.wait();
                    } catch (InterruptedException e) {}
                }
            }
        });

        even.start();
        odd.start();
        try { even.join(); odd.join(); } catch (InterruptedException e) {}
    }
}
