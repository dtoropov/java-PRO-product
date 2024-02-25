package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.User;
import java.util.HashMap;
import org.springframework.stereotype.Component;

/**
 * UserRepository.
 *
 * @author DToropov
 */
@Component
public class UserRepository {

  private final HashMap<Long, User> hashUser;

  public UserRepository() {
    this.hashUser = new HashMap<>();
    hashUser.put(1L, new User(1L, "Иванов"));
    hashUser.put(2L, new User(2L, "Петров"));
    hashUser.put(3L, new User(3L, "Сидоров"));
  }

  public User getUserById(Long id) {
    return hashUser.get(id);
  }

}
