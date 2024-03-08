package ru.vtb.toropov.javaPROproduct.service;

import ru.vtb.toropov.javaPROproduct.dtos.PaymentDto;
import ru.vtb.toropov.javaPROproduct.exceptions.ResourceNotFound;
import ru.vtb.toropov.javaPROproduct.integration.ProductIntegration;
import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import java.math.BigDecimal;
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

  public void makePayment(PaymentDto request) {
    boolean isProductExists = false;
    boolean isEnoughMoney = false;
    UserProduct[] userProducts = productIntegration.getProductByUserId(request.getUserId());
    for (UserProduct userProduct : userProducts
    ) {
      if (Objects.equals(userProduct.getProductId(), request.getProductId())) {
        isProductExists = true;
        if (userProduct.getBalance().compareTo(request.getAmount()) > 0) {
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
