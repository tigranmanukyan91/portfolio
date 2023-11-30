package threads;

public class SynchronizedImpl {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        SynchronizedImpl sync = new SynchronizedImpl();
        sync.doWork();
    }

    //Aystex nshum enq konkretvor obyekti monitor@ vercni Thread@
    public void increment(){
        synchronized (this){
            counter++;
        }
    }


    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000 ; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    /*  Synchronized aranc nshelu te vor obyekti monitor@ petqa vercni Thread@, ays depqum  SynchronizedImpl sync = new SynchronizedImpl();
    * */
//    public synchronized void increment(){
//        counter++;
//    }
}
