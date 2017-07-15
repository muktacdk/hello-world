import java.awt.*;

/**
 * Created by kulkarmu on 7/14/2017.
 */
public class Mechanic {

    public static void main(String[] args) {
        Car car = new Car(222, "BMW", 50, "black");
        car.details();
        car.inspect();

        System.out.println("==================================");

        Bike bike = new Bike(101, "abc", 40);
        bike.details();
       // bike.inspect();

    }
}
