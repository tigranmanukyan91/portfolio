package threads;

import java.util.Random;

public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            Random random = new Random();
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000_000; i++) {
                    // Thread here is checking if it is interrupted from outside or no
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Starting thread");
        thread.start();
        thread.interrupt();
        thread.join();

        Thread.sleep(1000);
        System.out.println("Thread has finished");
    }
}
