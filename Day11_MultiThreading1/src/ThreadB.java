import java.io.*;

/**
 * Created by kulkarmu on 7/31/2017.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\kulkarmu\\IdeaProjects\\Day11\\MultiThreading1\\src\\file2");
            int b = fis.read();
            while (b != -1) {
                System.out.print((char) b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
