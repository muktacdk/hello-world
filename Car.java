/**
 * Created by kulkarmu on 7/14/2017.
 */
public class Car extends Vehicle {

    String color;

    Car(){}

    Car(int vin, String name, int speed, String color) {
        super(vin, name, speed);
        this.color = color;

    }

    void details() {
        System.out.println("Details of car");
        System.out.println("Name : " + this.name);
        System.out.println("color : " + this.color);
        System.out.println("speed : " + this.speed);
    }

    void drive() {
        System.out.println("Car with stearing");
    }

    void inspect() {
        System.out.println("in Car.inspect()");
    }
}
