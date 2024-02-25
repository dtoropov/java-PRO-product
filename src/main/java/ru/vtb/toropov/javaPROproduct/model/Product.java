package ru.vtb.toropov.javaPROproduct.model;

/**
 * Product.
 *
 * @author DToropov
 */
public class Product {
  private Long id;
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}
