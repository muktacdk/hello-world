import java.util.Comparator;

/**
 * Created by kulkarmu on 7/25/2017.
 */
public class IDComaparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getId() < o2.getId())
            return 1;
        else if(o1.getId() == o2.getId())
            return 0;
        return -1;
    }
}
