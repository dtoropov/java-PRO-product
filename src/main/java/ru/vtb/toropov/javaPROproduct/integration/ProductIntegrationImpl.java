package ru.vtb.toropov.javaPROproduct.integration;

import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import org.springframework.web.client.RestTemplate;

/**
 * ProductIntegrationImpl.
 *
 * @author DToropov
 */
public class ProductIntegrationImpl implements ProductIntegration{

  private final RestTemplate restTemplate;

  public ProductIntegrationImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public UserProduct[] getProductById(Long id) {
    return restTemplate.getForObject("/productById/"+id, UserProduct[].class );
  }

  @Override
  public UserProduct[]  getProductByUserId(Long id) {
    return restTemplate.getForObject("/productByUser/"+id, UserProduct[].class);
  }

  @Override
  public UserProduct[] getProductAll() {
    return restTemplate.getForObject("/product", UserProduct[].class);
  }
}
