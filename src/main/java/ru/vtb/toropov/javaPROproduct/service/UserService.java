package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.model.User;
import ru.vtb.toropov.javaPROproduct.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService.
 *
 * @author DToropov
 */
@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public void setUserRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> findById(Long id) {

    return userRepository.findById(id);
  }

}
