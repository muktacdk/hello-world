package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDAO {
    Map<Integer, Car> cars;

    @PostConstruct
    public void init(){
        cars = new HashMap<>();
        cars.put(1000, new Car(1000, "E1", "BMW", 7000000.00, 4));
    }


    public Car readByVin(int vin){
        //JDBC Logic
       return new Car(1000, "X5", "BMW", 7000000.00, 5);
    }

    public String add(Car car){
        int id = cars.size() * 1000 + 1000;
        car.setVin(id);
        cars.put(id, car);
        return "car with vin " + id + " added successfully!!";
    }

    public void delete(int vin) {
        cars.remove(vin);
    }
}
