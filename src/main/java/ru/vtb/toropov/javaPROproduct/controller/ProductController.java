package ru.vtb.toropov.javaPROproduct.controller;

import ru.vtb.toropov.javaPROproduct.model.Product;
import ru.vtb.toropov.javaPROproduct.model.User;
import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import ru.vtb.toropov.javaPROproduct.service.ProductService;
import ru.vtb.toropov.javaPROproduct.service.UserProductService;
import ru.vtb.toropov.javaPROproduct.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController.
 *
 * @author DToropov
 */
@RestController
public class ProductController {

  private ProductService productService;
  private UserService userService;
  private UserProductService userProductService;

  public ProductService getProductService() {
    return productService;
  }

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

  public UserService getUserService() {
    return userService;
  }

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  public UserProductService getUserProductService() {
    return userProductService;
  }

  @Autowired
  public void setUserProductService(
      UserProductService userProductService) {
    this.userProductService = userProductService;
  }

  @GetMapping("/product")
  public Product getProductById(@RequestParam Long id) {
    return productService.getProductById(id);
  }

  @GetMapping("/user")
  public User getUserById(@RequestParam Long id) {
    return userService.getUserById(id);
  }

  @GetMapping("/productByUser")
  public List<UserProduct> getProductByUserId(@RequestParam Long userId) {
    return userProductService.getProductByUserId(userId);
  }

  @GetMapping("/productAll")
  public List<UserProduct> getProductAll() {
    return userProductService.getProductAll();
  }

}
