package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository.
 *
 * @author DToropov
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
