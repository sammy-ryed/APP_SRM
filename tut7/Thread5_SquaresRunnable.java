public class Thread5_SquaresRunnable {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int x = 1; x <= 5; x++) {
                System.out.println(x + " squared = " + (x * x));
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
        };

        Thread t = new Thread(r);
        t.start();
        try { t.join(); } catch (InterruptedException e) {}
    }
}
