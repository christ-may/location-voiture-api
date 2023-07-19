package be.businesstraining.repository;

import be.businesstraining.security.domain.security.Location;

import org.springframework.data.repository.CrudRepository;

public interface ILocationRepository extends CrudRepository<Location, Long> {
}
