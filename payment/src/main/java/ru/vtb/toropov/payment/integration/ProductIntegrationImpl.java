package ru.vtb.toropov.payment.integration;

import ru.vtb.toropov.payment.dtos.UserProductDto;
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
  public UserProductDto[] getProductById(Long id) {
    return restTemplate.getForObject("/productById/"+id, UserProductDto[].class );
  }

  @Override
  public UserProductDto[]  getProductByUserId(Long id) {
    return restTemplate.getForObject("/productByUser/"+id, UserProductDto[].class);
  }

  @Override
  public UserProductDto[] getProductAll() {
    return restTemplate.getForObject("/product", UserProductDto[].class);
  }
}
