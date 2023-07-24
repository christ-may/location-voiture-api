package be.businesstraining.security.repository;

import be.businesstraining.security.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface IUserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
