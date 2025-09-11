package mentorship.roadmap.Java_Core.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i<5; i++) {
            final int taskNumber = i;
            executorService.execute(() -> System.out.println(taskNumber + " " + Thread.currentThread().getName()));
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }
}
