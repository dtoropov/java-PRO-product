package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.integration.ProductIntegration;
import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService.
 *
 * @author DToropov
 */
@Service
public class ProductService {

  private ProductIntegration productIntegration;

  @Autowired
  public void setProductIntegration(
      ProductIntegration productIntegration) {
    this.productIntegration = productIntegration;
  }

  public UserProduct[] getProductById(Long id) {
    return productIntegration.getProductById(id);
  }

  public UserProduct[]  getProductByUserId(Long id) {
    return productIntegration.getProductByUserId(id);
  }

  public UserProduct[] getProductAll() {
    return productIntegration.getProductAll();
  }

}
