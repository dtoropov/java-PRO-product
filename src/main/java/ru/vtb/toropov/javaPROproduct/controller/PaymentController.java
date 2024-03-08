package ru.vtb.toropov.javaPROproduct.controller;

import ru.vtb.toropov.javaPROproduct.dtos.PaymentDto;
import ru.vtb.toropov.javaPROproduct.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController.
 *
 * @author DToropov
 */
@RestController
public class PaymentController {

  private PaymentService paymentService;

  @Autowired
  public void setPaymentService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @PostMapping("/makePayment")
  public void makePayment(@RequestBody PaymentDto request) {
    paymentService.makePayment(request);
  }
}
