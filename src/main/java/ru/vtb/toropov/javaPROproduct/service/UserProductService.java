package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import ru.vtb.toropov.javaPROproduct.repository.UserProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserProductService.
 *
 * @author DToropov
 */
@Service
public class UserProductService {

  private UserProductRepository userProductRepository;

  @Autowired
  public void setUserProductRepository(
      UserProductRepository userProductRepository) {
    this.userProductRepository = userProductRepository;
  }

  public List<UserProduct> findByUserId(Long userId) {
    return userProductRepository.findByUserId(userId);
  }
  public List<UserProduct> findAll() {

    return userProductRepository.findAll();
  }
}
