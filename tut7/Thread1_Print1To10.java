public class Thread1_Print1To10 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int x = 1; x <= 10; x++) {
                System.out.println(x);
                try { Thread.sleep(100); } catch (InterruptedException e) { /* ignore */ }
            }
        });
        t.start();
        try { t.join(); } catch (InterruptedException e) { /* ignore */ }
    }
}
