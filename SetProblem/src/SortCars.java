import java.util.*;

/**
 * Created by kulkarmu on 7/25/2017.
 */
public class SortCars {

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        createSetData(cars);

        Iterator<Car> itr  = cars.iterator();

        while(itr.hasNext()){
            Car car = itr.next();
            System.out.println(car);
        }
        System.out.println("=========================================");

        List<Car> list = new ArrayList<>();
        list.addAll(cars);
        Collections.sort(list, new IDComaparator());

        Iterator<Car> itr1  = list.iterator();

        while(itr1.hasNext()){
            Car car = itr1.next();
            System.out.println(car);
        }
        System.out.println("=========================================");

        Collections.sort(list, new BrandComparator());

        Iterator<Car> itr2  = list.iterator();

        while(itr2.hasNext()){
            Car car = itr2.next();
            System.out.println(car);
        }

        /*Set<Car> cars1 = new TreeSet<>(new IDComaparator());
        cars1 = createSetData(cars1);

        Iterator<Car> itr1  = cars1.iterator();

        while(itr1.hasNext()){
            Car car = itr1.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }
        System.out.println("=========================================");


        Set<Car> cars2 = new TreeSet<>(new BrandComparator());
        cars2 = createSetData(cars2);

        Iterator<Car> itr2  = cars2.iterator();

        while(itr2.hasNext()){
            Car car = itr2.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }


        Collections.sort(cars);
        Iterator<Car> itr  = cars.iterator();

        while(itr.hasNext()){
            Car car = itr.next();
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getPrice());
        }

        System.out.println("=========================================");
        sortOnId();
        System.out.println("=========================================");
        sortOnBrand();*/

    }

    private static void createSetData(Set<Car> cars){
        cars.add(new Car(101, "Honda", 3000000.0));
        cars.add(new Car(102, "BMW", 7000000.0));
        cars.add(new Car(110, "Renault", 4000000.0));
        cars.add(new Car(104, "Renault", 4100000.0));
        cars.add(new Car(135, "BMW", 6000000.0));
        cars.add(new Car(106, "Honda", 4500000.0));
        cars.add(new Car(1007, "Honda", 5000000.0));
        cars.add(new Car(108, "Benz", 6500000.0));
        cars.add(new Car(109, "Honda", 2000000.0));
        cars.add(new Car(103, "Honda", 2500000.0));
        cars.add(new Car(111, "Ford", 1000000.0));
        cars.add(new Car(12, "Ford", 3500000.0));
        cars.add(new Car(113, "Benz", 4200000.0));
        cars.add(new Car(1214, "Ford", 5200000.0));
        cars.add(new Car(15, "Toyota", 3300000.0));
        cars.add(new Car(116, "BMW", 8000000.0));
        cars.add(new Car(117, "BMW", 3700000.0));
        cars.add(new Car(1180, "Benz", 4800000.0));
        cars.add(new Car(1109, "Toyota", 4700000.0));
        cars.add(new Car(1200, "Renault", 6700000.0));
        cars.add(new Car(1121, "BMW", 7200000.0));

    }

    /*private static void sortOnId() {
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
    }*/

}
