package be.businesstraining.repository;

import be.businesstraining.security.domain.security.Rental;

import org.springframework.data.repository.CrudRepository;

public interface ILocationRepository extends CrudRepository<Rental, Long> {
}
