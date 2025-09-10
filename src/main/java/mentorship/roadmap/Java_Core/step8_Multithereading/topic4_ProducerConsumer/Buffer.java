package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private final List<Integer> list = new ArrayList();
    private final int MAX_SIZE = 5;

    synchronized void put(int value) {
        while (list.size() == MAX_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        list.add(value);
        notifyAll();
    }
    synchronized int get() {
        while (list.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int value = list.remove(0);
        notifyAll();
        return value;
    }
}
