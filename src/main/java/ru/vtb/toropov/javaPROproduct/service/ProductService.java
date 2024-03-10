package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.model.Product;
import ru.vtb.toropov.javaPROproduct.repository.ProductRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService.
 *
 * @author DToropov
 */
@Service
public class ProductService {

  private ProductRepository productRepository;

  @Autowired
  public void setProductRepository(
      ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Optional<Product> findById(Long id) {
    return productRepository.findById(id);
  }

}
