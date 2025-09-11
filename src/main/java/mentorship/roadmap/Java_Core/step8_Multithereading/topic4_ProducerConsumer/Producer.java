package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

public class Producer implements Runnable {

        private final Buffer buffer;

        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for(int i = 0; i< buffer.getMAX_SIZE(); i++) {
                buffer.add(i);
                System.out.println("добавлен элемент  " + i);
            }
        }


    }

