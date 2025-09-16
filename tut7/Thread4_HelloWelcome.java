public class Thread4_HelloWelcome {
    public static void main(String[] args) {
        Thread hello = new Thread(() -> {
            for (int x = 1; x <= 5; x++) {
                System.out.println("Hello");
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
        });

        Thread welcome = new Thread(() -> {
            for (int x = 1; x <= 5; x++) {
                System.out.println("Welcome");
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
        });

        hello.start();
        welcome.start();
        try { hello.join(); welcome.join(); } catch (InterruptedException e) {}
    }
}
