package mentorship.roadmap.Java_Core.step8_Multithereading.topic7_ThreadLocal;

public class ThreadLocalDemo {
    private static final ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                threadLocalValue.set(threadLocalValue.get() + 1);
            }
            System.out.println(Thread.currentThread().getName() + " -> " + threadLocalValue.get());
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");


        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }
}
