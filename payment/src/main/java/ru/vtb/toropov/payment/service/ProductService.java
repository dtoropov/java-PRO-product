package ru.vtb.toropov.payment.service;

import ru.vtb.toropov.payment.dtos.UserProductDto;
import ru.vtb.toropov.payment.integration.ProductIntegration;
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

  public UserProductDto[] getProductById(Long id) {
    return productIntegration.getProductById(id);
  }

  public UserProductDto[]  getProductByUserId(Long id) {
    return productIntegration.getProductByUserId(id);
  }

  public UserProductDto[] getProductAll() {
    return productIntegration.getProductAll();
  }

}
