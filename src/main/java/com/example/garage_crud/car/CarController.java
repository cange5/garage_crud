package com.example.garage_crud.car;

import com.example.garage_crud.car.car_service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getStudent(@PathVariable Long id){
        return carService.getCar(id);
    }

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car){
        return carService.createCar(car);
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car){
        if(!id.equals(car.getId())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "id in path doesn't match id in Car object");
        }
        return carService.updateCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }
}
