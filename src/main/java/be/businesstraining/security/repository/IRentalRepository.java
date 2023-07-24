package be.businesstraining.security.repository;

import be.businesstraining.security.domain.security.Rental;

import org.springframework.data.repository.CrudRepository;

public interface IRentalRepository extends CrudRepository<Rental, Long> {
}
