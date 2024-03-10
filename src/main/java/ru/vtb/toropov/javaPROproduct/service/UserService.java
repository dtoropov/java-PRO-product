package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.model.Product;
import ru.vtb.toropov.javaPROproduct.model.User;
import ru.vtb.toropov.javaPROproduct.repository.ProductRepository;
import ru.vtb.toropov.javaPROproduct.repository.UserRepository;
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

  public User getUserById(Long id) {
    return userRepository.getUserById(id);
  }

}
