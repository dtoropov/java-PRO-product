package ru.vtb.toropov.product.controller;

import ru.vtb.toropov.product.model.Product;
import ru.vtb.toropov.product.model.UserProduct;
import ru.vtb.toropov.product.service.ProductService;
import ru.vtb.toropov.product.service.UserProductService;
import java.util.List;
import java.util.Optional;
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
    private UserProductService userProductService;

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }
  @Autowired
  public void setUserProductService(
      UserProductService userProductService) {
    this.userProductService = userProductService;
  }

  @GetMapping("/product/{id}")
  public Optional<Product> findById(@PathVariable Long id) {
    return productService.findById(id);
  }

  @GetMapping("/productByUser/{id}")
  public List<UserProduct> findByUserId(@PathVariable Long id) {
    return userProductService.findByUserId(id);
  }

  @GetMapping("/product")
  public List<UserProduct> findAll() {
    return userProductService.findAll();
  }

}
