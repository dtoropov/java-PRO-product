package ru.vtb.toropov.product.controller;

import ru.vtb.toropov.product.model.User;
import ru.vtb.toropov.product.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController.
 *
 * @author DToropov
 */
@RestController
public class UserController {

  private UserService userService;

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user/{id}")
  public Optional<User> findById(@PathVariable Long id) {
    return userService.findById(id);
  }

}
