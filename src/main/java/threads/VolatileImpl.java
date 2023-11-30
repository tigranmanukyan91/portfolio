package threads;

import java.util.Scanner;

public class VolatileImpl {
    public static void main(String[] args) {
        MyVolatileThread thread = new MyVolatileThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();
    }
}

class MyVolatileThread extends Thread{

    private volatile boolean running = true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
