package ru.vtb.toropov.product.service;

import ru.vtb.toropov.product.model.Product;
import ru.vtb.toropov.product.repository.ProductRepository;
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
