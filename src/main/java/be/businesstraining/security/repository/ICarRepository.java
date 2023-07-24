package be.businesstraining.security.repository;

import be.businesstraining.security.domain.security.Car;

import org.springframework.data.repository.CrudRepository;

public interface ICarRepository extends CrudRepository<Car, Long> {

}
