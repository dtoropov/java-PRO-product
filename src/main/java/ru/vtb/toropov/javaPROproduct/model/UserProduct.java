package ru.vtb.toropov.javaPROproduct.model;

import java.math.BigDecimal;

/**
 * UserProduct.
 *
 * @author DToropov
 */
public class UserProduct {

  private Long id;
  private Long userId;

  private String userName;

  private Long productId;

  private String productName;

  private String account;

  private BigDecimal balance;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
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

  public UserProduct(Long id, Long userId, String userName, Long productId, String productName,
      String account, BigDecimal balance) {
    this.id = id;
    this.userId = userId;
    this.userName = userName;
    this.productId = productId;
    this.productName = productName;
    this.account = account;
    this.balance = balance;
  }
}
