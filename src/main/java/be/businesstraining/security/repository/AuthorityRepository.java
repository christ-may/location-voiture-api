package be.businesstraining.security.repository;

import be.businesstraining.security.domain.security.Authority;
import be.businesstraining.security.domain.security.AuthorityName;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findByName(AuthorityName authorityName);
}
