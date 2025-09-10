package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;




public class Consumer implements Runnable {
        private final Buffer buffer;
    private volatile boolean running = true;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            while (running) {
                int value = buffer.get();
                System.out.println("Consumed " + value);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }

    public void stop() {
        running = false;
    }

    }

