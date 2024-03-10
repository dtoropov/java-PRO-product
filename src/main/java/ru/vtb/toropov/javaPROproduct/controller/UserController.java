package ru.vtb.toropov.javaPROproduct.controller;

import ru.vtb.toropov.javaPROproduct.model.User;
import ru.vtb.toropov.javaPROproduct.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
