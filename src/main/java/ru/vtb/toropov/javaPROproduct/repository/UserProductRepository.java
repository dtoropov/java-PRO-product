package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 * UserProductRepository.
 *
 * @author DToropov
 */
@Component
public class UserProductRepository {

  private final HashMap<Long, UserProduct> hashUserProduct;

  public UserProduct getUserProductById(Long id) {
    return hashUserProduct.get(id);
  }

  public UserProductRepository() {
    this.hashUserProduct = new HashMap<>();
    hashUserProduct.put(1L, new UserProduct(1L, 1L, "Иванов", 1L, "Кредиты", "40817810099910004312",
        new BigDecimal(1000000)));
    hashUserProduct.put(2L,
        new UserProduct(2L, 1L, "Иванов", 2L, "Депозиты", "40817810099910004313",
            new BigDecimal(2000000)));
    hashUserProduct.put(3L,
        new UserProduct(3L, 1L, "Иванов", 3L, "Текущие счета", "40817810099910004314",
            new BigDecimal(3000000)));
    hashUserProduct.put(4L,
        new UserProduct(4L, 2L, "Петров", 1L, "Кредиты", "40817810099910004311",
            new BigDecimal(1000000)));
    hashUserProduct.put(5L,
        new UserProduct(5L, 3L, "Петров", 1L, "Кредиты", "40817810099910004310",
            new BigDecimal(4000000)));
  }

  public List<UserProduct> getProductByUserId(Long userId) {

    List<UserProduct> userProductList = new ArrayList<>();
    for (UserProduct userProduct : hashUserProduct.values()) {
      if (Objects.equals(userProduct.getUserId(), userId)) {
        userProductList.add(userProduct);
      }
    }
    return userProductList;
  }

  public List<UserProduct> getProductAll() {
    return hashUserProduct.values().stream().toList();
  }
}
