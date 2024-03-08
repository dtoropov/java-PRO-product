package ru.vtb.toropov.javaPROproduct.dtos;

import java.math.BigDecimal;

/**
 * PaymentDto.
 *
 * @author DToropov
 */
public class PaymentDto {
  private Long userId;

  private Long productId;

  private BigDecimal amount;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentDto(Long userId, Long productId, BigDecimal amount) {
    this.userId = userId;
    this.productId = productId;
    this.amount = amount;
  }

  public PaymentDto() {
  }
}
