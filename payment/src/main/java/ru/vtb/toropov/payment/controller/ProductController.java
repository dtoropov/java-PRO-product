package ru.vtb.toropov.payment.controller;

import ru.vtb.toropov.payment.dtos.UserProductDto;
import ru.vtb.toropov.payment.exceptions.ResourceNotFound;
import ru.vtb.toropov.payment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController.
 *
 * @author DToropov
 */
@RestController
public class ProductController {

  private ProductService productService;

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/productById/{id}")
  public UserProductDto[] getProductById(@PathVariable Long id) {
    UserProductDto[] arrayUserProduct = productService.getProductById(id);
    if (arrayUserProduct.length==0)
    {
      throw new ResourceNotFound("RESOURCE_NOT_FOUND", "Продукт с id =" +id +" не найден");
    }
    return productService.getProductById(id);
  }

  @GetMapping("/productByUser/{id}")
  public UserProductDto[]  getProductByUserId(@PathVariable Long id) {
    return productService.getProductByUserId(id);
  }

  @GetMapping("/product")
  public UserProductDto[] getProductAll() {
    return productService.getProductAll();
  }

}
