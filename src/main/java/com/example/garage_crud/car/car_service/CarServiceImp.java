package com.example.garage_crud.car.car_service;

import com.example.garage_crud.car.Car;
import com.example.garage_crud.car.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final CarsRepository carsRepository;

    public CarServiceImp(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public Car createCar(Car car) {
        return carsRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return carsRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carsRepository.deleteById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carsRepository.findAll();
    }

    @Override
    public Car getCar(Long id) {
        return carsRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Car> findByVendor(String vendor) {
        return carsRepository.findByVendor(vendor);
    }

    @Override
    public Car setFuelLevel(Long id, Double fuel) {
        Car car = carsRepository.findById(id).orElseThrow();
        car.setFuel(fuel);
        return carsRepository.save(car);
    }


}
