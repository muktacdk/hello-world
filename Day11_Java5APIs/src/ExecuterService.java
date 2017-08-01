import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by kulkarmu on 8/1/2017.
 */
public class ExecuterService {
    public static void main(String[] args){

        TaskA taskA  = new TaskA();
        Executor executor =  Executors.newCachedThreadPool();
        for(int i = 0; i < 100; i++){
            executor.execute(taskA);
        }
    }
}

class TaskA implements Runnable{

    public void run(){
        int sum = 0;
        for(int i = 1; i <= 500; i++)
            sum = sum + i;
            System.out.println(sum);
    }
}
