package ru.vtb.toropov.payment.config.properties;

import java.time.Duration;

/**
 * RestTemplateProperties.
 *
 * @author DToropov
 */
public class RestTemplateProperties {

  private String url;
  private Duration connectionTimeout;
  private Duration readTimeout;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Duration getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(Duration connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public Duration getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Duration readTimeout) {
    this.readTimeout = readTimeout;
  }

  public RestTemplateProperties(String url, Duration connectionTimeout, Duration readTimeout) {
    this.url = url;
    this.connectionTimeout = connectionTimeout;
    this.readTimeout = readTimeout;
  }
}
