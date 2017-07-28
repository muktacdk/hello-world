import javax.imageio.IIOException;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by kulkarmu on 7/27/2017.
 */
public class WriteToFile {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("toyota");
        cars.add("renault");
        cars.add("ford");
        cars.add("BMW");

        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\kulkarmu\\IdeaProjects\\Day8\\InputOutput\\src\\cars.txt");
            Iterator<String> itr = cars.iterator();
            while (itr.hasNext()){
                fw.write(itr.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
