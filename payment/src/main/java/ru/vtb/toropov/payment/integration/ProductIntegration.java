package ru.vtb.toropov.payment.integration;

import ru.vtb.toropov.payment.dtos.UserProductDto;

/**
 * ProductIntegration.
 *
 * @author DToropov
 */
public interface ProductIntegration {

  UserProductDto[] getProductById(Long id);

  UserProductDto[]  getProductByUserId(Long id);

  UserProductDto[]  getProductAll();

}
