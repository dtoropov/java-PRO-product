package ru.vtb.toropov.javaPROproduct.integration;

import ru.vtb.toropov.javaPROproduct.model.UserProduct;

/**
 * ProductIntegration.
 *
 * @author DToropov
 */
public interface ProductIntegration {

  UserProduct[] getProductById(Long id);

  UserProduct[]  getProductByUserId(Long id);

  UserProduct[]  getProductAll();

}
