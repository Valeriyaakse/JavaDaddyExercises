package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;


public class ProducerConsumerDemo {


    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
        try {
        Thread.sleep(5000);

        producer.stop();
        consumer.stop();

        producerThread.interrupt();
        consumerThread.interrupt();


            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

