import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kulkarmu on 8/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }


}
