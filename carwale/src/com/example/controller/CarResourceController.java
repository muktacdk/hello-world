package com.example.controller;

import com.example.model.Car;
import com.example.dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

    @RequestMapping(value = "car",produces = "text/plain", method = RequestMethod.GET)
    public String readCar(){
        return "vin-100, model-Q7, make-Audi, price-7000000, qty-10";
    }

   /* @RequestMapping(value = "car",produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public String readCarAsXML(){
        return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>7000000</price><qty>10</qty></car>";
    }*/

    @RequestMapping(value = "car",produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXML(){
        Car car = carDAO.readByVin(1000);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>7000000</price><qty>10</qty></car>";
    }

    /*@RequestMapping(value = "car",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public  String readCarAsJson() {
        return "{\"vin\":100,\"model\":\"Q7\",\"make\":\"Audi\",\"price\":7800000,\"Qty\":10}";
    }*/

    @RequestMapping(value = "car",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJSON(){
        Car car = carDAO.readByVin(1000);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>7000000</price><qty>10</qty></car>";
    }

    @RequestMapping(value = "car/add",consumes = APPLICATION_JSON_VALUE, produces = TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public String addCar(@RequestBody Car car){
        System.out.println(car);
        return carDAO.add(car);
    }

    @RequestMapping(value = "car/delete/{vin}", produces = TEXT_PLAIN_VALUE, method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable int vin){
        carDAO.delete(vin);
        return "Car with vin " + vin + " is deleted successfully!!";
    }

}
