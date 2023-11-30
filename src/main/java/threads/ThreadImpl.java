package threads;

public class ThreadImpl {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();
//
//
//        MyThread thread1 = new MyThread();
//        thread1.start();
//
//
//        System.out.println("I am going to sleep");
//        Thread.sleep(3000);
//        System.out.println("I am awake");

        Thread threadRun = new Thread(new Runner());
        threadRun.start();
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread" + i);
        }
    }
}
