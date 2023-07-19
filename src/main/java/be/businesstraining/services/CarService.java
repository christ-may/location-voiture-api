package be.businesstraining.services;

import be.businesstraining.security.domain.security.Car;


public interface CarService {


    Iterable<Car> getAllCar();

    Car getCarById(Long id);

    void addCar(Car car);

    Car updateCar(Car car);

    boolean deleteCar(Long id);
}
