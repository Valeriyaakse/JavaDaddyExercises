package mentorship.roadmap.Java_Core.step8_Multithereading.topic6_Interrupt;



public class InterruptDemo {
   static class MyThread extends Thread {
       @Override
       public void run() {
      try{
          while (true) {
              System.out.println("Работаю...");
              Thread.sleep(500);

              if (isInterrupted()) {
                  System.out.println("Поток прерван");
                  return;
              }
          }
      }
           catch (InterruptedException e) {
               System.out.println("Поток прерван во время сна");;
           }
       }
   }

    public static void main(String[] args) throws InterruptedException {
       MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(3000);

        myThread.interrupt();
    }

}
