package ru.vtb.toropov.payment.service;

import ru.vtb.toropov.payment.dtos.PaymentDto;
import ru.vtb.toropov.payment.dtos.UserProductDto;
import ru.vtb.toropov.payment.exceptions.ResourceNotFound;
import ru.vtb.toropov.payment.integration.ProductIntegration;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PaymentService.
 *
 * @author DToropov
 */
@Service
public class PaymentService {

  private ProductIntegration productIntegration;

  @Autowired
  public void setProductIntegration(
      ProductIntegration productIntegration) {
    this.productIntegration = productIntegration;
  }

  public void makePayment(Long userId, PaymentDto request) {
    boolean isProductExists = false;
    boolean isEnoughMoney = false;
    UserProductDto[] userProducts = productIntegration.getProductByUserId(userId);
    for (UserProductDto userProductDto : userProducts
    ) {
      if (Objects.equals(userProductDto.getProduct().getId(), request.getProductId())) {
        isProductExists = true;
        if (userProductDto.getBalance().compareTo(request.getAmount()) > 0) {
          isEnoughMoney = true;
        }
      }
    }
    if (!isProductExists)
    {
      throw new ResourceNotFound("RESOURCE_NOT_FOUND", "Продукт с id =" +request.getProductId() +" не найден");
    }
    if (!isEnoughMoney)
    {
      throw new ResourceNotFound("MONEY_NOT_ENOUGH", "На счёте не достаточно средств");
    }
  }
}
