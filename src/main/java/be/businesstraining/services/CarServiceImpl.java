package be.businesstraining.services;


import be.businesstraining.security.domain.security.Car;
import be.businesstraining.security.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarServiceImpl implements CarService{


    @Autowired
    private ICarRepository carRepo;

    public CarServiceImpl(ICarRepository carRepo) {
        this.carRepo = carRepo;
    }


    @Override
    public Iterable<Car> getAllCar() {
        return carRepo.findAll();

    }

    public Car getCarById(Long id) {
        return carRepo.findById(id).orElse(null);
    }


    public void addCar(Car car){
        Optional<Car> car1 = carRepo.findById(car.getId());
        if (car1 != null){
            carRepo.save(car);
        }
    }

    public Car updateCar(Car car){
        return carRepo.save(car);
    }


    public boolean deleteCar(Long id) {
        Car car = getCarById(id);
        boolean retour = false;
        if (car != null) {
            carRepo.delete(car);
            retour = true;
        }
        return retour;
    }

    @Override
    public String toString() {
        return "liste de voiture"+this.carRepo;
    }
}
