package com.example.garage_crud.car;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Long> {
    public List<Car> findByVendor(String vendor);
}
