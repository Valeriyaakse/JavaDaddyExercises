package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

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
        System.out.println(counter.getCount());

    }
}
