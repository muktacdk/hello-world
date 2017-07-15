/**
 * Created by kulkarmu on 7/14/2017.
 */
abstract public class Vehicle {
    int vin = 0;
    String name = null;
    int speed = 0;

    Vehicle() {
    }

    Vehicle(int vin, String name, int speed) {
        this.vin = vin;
        this.name = name;
        this.speed = speed;
    }

    void details() {
        System.out.println("Details of vehicle");
    }

    abstract void drive();
    abstract void inspect();
}
