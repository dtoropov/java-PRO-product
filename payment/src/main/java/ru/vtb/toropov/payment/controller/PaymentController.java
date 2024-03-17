package ru.vtb.toropov.payment.controller;

import ru.vtb.toropov.payment.dtos.PaymentDto;
import ru.vtb.toropov.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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
  public void makePayment(@RequestHeader("userId") Long userId, @RequestBody PaymentDto request) {
    paymentService.makePayment(userId, request);
  }
}
