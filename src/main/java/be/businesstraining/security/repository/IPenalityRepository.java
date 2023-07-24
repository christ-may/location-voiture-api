package be.businesstraining.security.repository;

import be.businesstraining.security.domain.security.Penality;
import org.springframework.data.repository.CrudRepository;

public interface IPenalityRepository extends CrudRepository<Penality,Long> {
}
