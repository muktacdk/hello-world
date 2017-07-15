/**
 * Created by kulkarmu on 7/14/2017.
 */
public class Bike extends Vehicle {

    Bike(int vin, String name, int speed) {
        super(vin, name, speed);
    }

    void details() {
        System.out.println("Details of Bike");
        System.out.println("Name : " + this.name);
        System.out.println("Speed : " + this.speed);
    }

    void drive() {
        System.out.println("Bike with handle");
    }

    void inspect() {

    }
}
