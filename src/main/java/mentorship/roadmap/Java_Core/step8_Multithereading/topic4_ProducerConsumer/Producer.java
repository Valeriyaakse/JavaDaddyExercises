package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

public class Producer implements Runnable {

        private final Buffer buffer;
    private volatile boolean running = true;

        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            int value = 0;
            while (running) {
                buffer.put(value++);
                System.out.println("Produced " + (value - 1));
                try {
                    Thread.sleep(500);
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

