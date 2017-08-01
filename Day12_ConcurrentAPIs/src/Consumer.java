import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kulkarmu on 8/1/2017.
 */
public class Consumer extends Thread {
    LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

    public Consumer(LinkedBlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                System.out.println(blockingQueue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*try {
            System.out.println(blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
