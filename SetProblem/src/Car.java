/**
 * Created by kulkarmu on 7/25/2017.
 */
public class Car implements Comparable<Car>{
    private int id;
    private String brand;
    private double price;

    public Car(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        if (this.getPrice() > o.getPrice())
            return -1;
        else if (this.getPrice() == o.getPrice())
            return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", brand = '" + brand + '\'' +
                ", price = " + price +
                '}';
    }
}
