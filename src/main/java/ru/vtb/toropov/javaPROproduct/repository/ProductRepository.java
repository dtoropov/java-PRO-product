package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.Product;
import java.util.HashMap;
import org.springframework.stereotype.Component;

/**
 * ProductRepository.
 *
 * @author DToropov
 */
@Component
public class ProductRepository {

  private final HashMap<Long, Product> hashProduct;

  public ProductRepository() {
    this.hashProduct = new HashMap<>();
    hashProduct.put(1L, new Product(1L, "Кредиты"));
    hashProduct.put(2L, new Product(2L, "Депозиты"));
    hashProduct.put(3L, new Product(3L, "Текущие счета"));
  }

  public Product getProductById(Long id) {
    return hashProduct.get(id);
  }
}
