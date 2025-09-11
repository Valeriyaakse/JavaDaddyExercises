package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;




public class Consumer implements Runnable {
        private final Buffer buffer;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for(int i = 0; i< buffer.getMAX_SIZE(); i++)  {
                System.out.println("удален элемент " + buffer.get());

            }
        }


    }

