package ru.vtb.toropov.product.repository;

import ru.vtb.toropov.product.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository.
 *
 * @author DToropov
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
