package ru.vtb.toropov.javaPROproduct.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 * UserProduct.
 *
 * @author DToropov
 */
@Entity
@Table(name="userproduct", schema = "java_pro")
public class UserProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private Long id;

  @ManyToOne
  @JoinColumn(name ="userid")
  private User user;
  @ManyToOne
  @JoinColumn(name ="productid")
  private Product product;

  @Column(name="account")
  private String account;

  @Column(name="balance")
  private BigDecimal balance;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
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

  public UserProduct(Long id, User user, Product product, String account, BigDecimal balance) {
    this.id = id;
    this.user = user;
    this.product = product;
    this.account = account;
    this.balance = balance;
  }

  public UserProduct() {
  }
}
