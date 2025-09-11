package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

public class DeadlockDemo {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();


    public static void main(String[] args) {
        Runnable runnable1 = () -> {
           synchronized (lock1) {
               System.out.println("thread 1 захватил lock1");
               synchronized (lock2) {
                   System.out.println("thread 1 захватил lock1+lock2");
               }
           }
        };
        Runnable runnable2 = () -> {
            synchronized (lock2) {
                System.out.println("thread 2 захватил lock2");
                synchronized (lock1) {
                    System.out.println("thread 2 захватил lock1+lock2");
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
