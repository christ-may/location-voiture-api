package be.businesstraining.repository;

import be.businesstraining.security.domain.security.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientRepository extends CrudRepository<Client,Long> {

}
