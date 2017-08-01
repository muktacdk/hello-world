import org.junit.Test;

/**
 * Created by kulkarmu on 7/31/2017.
 */
public class Main {
    int i = 0;
    @Test
    public void testThread() {
        //int i = 0;

        Thread thread1 = new Thread(() -> {
            //i++;
            for (int j = 0; j < 2000000; j++) {
                (this.i)++;
            }
        });

        Thread thread2 = new Thread(() -> {
            //System.out.println("i = " + i);
            for (int j = 0; j < 2000000; j++) {
                System.out.println("i = " + this.i);
            }
        });

        thread1.start();
        thread2.start();
        /*for (int j = 0; j < 20; j++) {
            thread1.start();
            thread2.start();
        }*/


       /* ValueTask valueTask = new ValueTask();
        PrintTask printTask = new PrintTask();*/

        /*for (int i = 0; i < 20; i++) {
            Worker1 worker1 = new Worker1(valueTask);
            Worker2 worker2 = new Worker2(printTask);

            worker1.start();
            worker2.start();
        }*/

    }

}
