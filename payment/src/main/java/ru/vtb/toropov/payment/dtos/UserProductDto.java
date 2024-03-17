package ru.vtb.toropov.payment.dtos;

import java.math.BigDecimal;

/**
 * UserProductDto.
 *
 * @author DToropov
 */
public class UserProductDto {

  private Long id;
  private UserDto user;
  private ProductDto product;
  private String account;
  private BigDecimal balance;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public ProductDto getProduct() {
    return product;
  }

  public void setProduct(ProductDto product) {
    this.product = product;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public UserProductDto(Long id, UserDto user, ProductDto product, String account,
      BigDecimal balance) {
    this.id = id;
    this.user = user;
    this.product = product;
    this.account = account;
    this.balance = balance;
  }

  public UserProductDto() {
  }
}
