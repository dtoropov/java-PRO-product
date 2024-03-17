package ru.vtb.toropov.payment.config;

import ru.vtb.toropov.payment.config.properties.ProductProperties;
import ru.vtb.toropov.payment.integration.ProductIntegration;
import ru.vtb.toropov.payment.integration.ProductIntegrationImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ApplicationConfig.
 *
 * @author DToropov
 */
@Configuration
public class IntegrationConfig {

  @Bean
  public ProductIntegration productIntegration(ProductProperties productProperties) {
    RestTemplate restTemplate = new RestTemplateBuilder().rootUri(
            productProperties.getClient().getUrl()).setConnectTimeout(productProperties.getClient()
            .getConnectionTimeout()).setReadTimeout(productProperties.getClient().getReadTimeout())
        .build();
    return  new ProductIntegrationImpl(restTemplate);
  }
}
