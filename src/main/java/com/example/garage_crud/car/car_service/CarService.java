package com.example.garage_crud.car.car_service;

import com.example.garage_crud.car.Car;

import java.util.List;

public interface CarService {
    Car createCar (Car car);
    Car updateCar(Car car);
    void deleteCar(Long id);
    List<Car> getAllCars();
    Car getCar(Long id);
    List<Car> findByVendor(String vendor);
    Car setFuelLevel(Long id, Double fuel);

}
