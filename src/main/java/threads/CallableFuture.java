package threads;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Thread is starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread is finished");
                Random random = new Random();
                return random.nextInt(10);
            }
        });
        executorService.shutdown();


        int result = future.get();// get is waiting for the thread to finish working

        System.out.println(result);

    }
}
