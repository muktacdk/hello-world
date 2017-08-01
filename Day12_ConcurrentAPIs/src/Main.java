import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kulkarmu on 8/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        producer.start();
        consumer.start();
    }


}
