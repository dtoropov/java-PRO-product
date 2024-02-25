package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.model.Product;
import ru.vtb.toropov.javaPROproduct.repository.ProductRepository;
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

  public ProductRepository getProductRepository() {
    return productRepository;
  }

  @Autowired
  public void setProductRepository(
      ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Product getProductById(Long id) {
    return productRepository.getProductById(id);
  }

}
