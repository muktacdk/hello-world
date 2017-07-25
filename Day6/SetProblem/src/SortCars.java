import java.util.*;

/**
 * Created by kulkarmu on 7/25/2017.
 */
public class SortCars {
    static List<Car> cars = new ArrayList<>();
    public static void main(String[] args) {
        cars.add(new Car(101, "Honda", 3000000.0));
        cars.add(new Car(102, "BMW", 7000000.0));
        cars.add(new Car(110, "Renault", 4000000.0));
        cars.add(new Car(104, "Renault", 4000000.0));
        cars.add(new Car(135, "BMW", 6000000.0));
        cars.add(new Car(106, "Honda", 4500000.0));
        cars.add(new Car(1007, "Honda", 5000000.0));
        cars.add(new Car(108, "Benz", 6500000.0));
        cars.add(new Car(109, "Honda", 2000000.0));
        cars.add(new Car(103, "Honda", 2500000.0));
        cars.add(new Car(111, "Ford", 1000000.0));
        cars.add(new Car(12, "Ford", 3500000.0));
        cars.add(new Car(113, "Benz", 4500000.0));
        cars.add(new Car(1214, "Ford", 5000000.0));
        cars.add(new Car(15, "Toyota", 3000000.0));
        cars.add(new Car(116, "BMW", 8000000.0));
        cars.add(new Car(117, "BMW", 3000000.0));
        cars.add(new Car(1180, "Benz", 4000000.0));
        cars.add(new Car(1109, "Toyota", 4500000.0));
        cars.add(new Car(1200, "Renault", 6500000.0));
        cars.add(new Car(1121, "BMW", 7000000.0));

        Collections.sort(cars);
        Iterator<Car> itr  = cars.iterator();

        while(itr.hasNext()){
            Car car = itr.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }

        System.out.println("=========================================");
        sortOnId();
        System.out.println("=========================================");
        sortOnBrand();

    }

    private static void sortOnId() {
        Collections.sort(cars, new IDComaparator());
        Iterator<Car> itr  = cars.iterator();

        while(itr.hasNext()){
            Car car = itr.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }
    }

    private static void sortOnBrand() {
        Collections.sort(cars, new BrandComparator());
        Iterator<Car> itr  = cars.iterator();

        while(itr.hasNext()){
            Car car = itr.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }
    }

}
