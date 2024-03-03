package ru.vtb.toropov.javaPROproduct.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

/**
 * ProductProperties.
 *
 * @author DToropov
 */

@ConfigurationProperties(prefix = "integrations.product")
public class ProductProperties {

  private RestTemplateProperties client;

  public RestTemplateProperties getClient() {
    return client;
  }

  @ConstructorBinding
  public ProductProperties(RestTemplateProperties client) {
    this.client = client;
  }
}
