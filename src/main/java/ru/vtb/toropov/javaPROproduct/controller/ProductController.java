package ru.vtb.toropov.javaPROproduct.controller;

import ru.vtb.toropov.javaPROproduct.exceptions.ResourceNotFound;
import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import ru.vtb.toropov.javaPROproduct.service.ProductService;
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
  public UserProduct[] getProductById(@PathVariable Long id) {
    UserProduct[] arrayUserProduct = productService.getProductById(id);
    if (arrayUserProduct.length==0)
    {
      throw  new ResourceNotFound("Продукт с id =" +id +" не найден");
    }
    return productService.getProductById(id);
  }

  @GetMapping("/productByUser/{id}")
  public UserProduct[]  getProductByUserId(@PathVariable Long id) {
    return productService.getProductByUserId(id);
  }

  @GetMapping("/product")
  public UserProduct[] getProductAll() {
    return productService.getProductAll();
  }

}
