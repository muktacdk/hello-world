import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kulkarmu on 7/27/2017.
 */
public class FileReader {
    public static void main(String[] args) {
        InputStream is = null;
        try{
            is = new FileInputStream("C:\\Users\\kulkarmu\\IdeaProjects\\Day8\\InputOutput\\src\\movies.txt");
            int b = is.read();
            while (b != -1) {
                System.out.print((char)b);
                b = is.read();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }



}
