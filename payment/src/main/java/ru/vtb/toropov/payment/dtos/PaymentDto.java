package ru.vtb.toropov.payment.dtos;

import java.math.BigDecimal;

/**
 * PaymentDto.
 *
 * @author DToropov
 */
public class PaymentDto {

  private Long productId;

  private BigDecimal amount;

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
    this.productId = productId;
    this.amount = amount;
  }

  public PaymentDto() {
  }
}
