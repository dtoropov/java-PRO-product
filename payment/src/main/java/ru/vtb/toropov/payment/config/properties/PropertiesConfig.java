package ru.vtb.toropov.payment.config.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * PropetiesConfig.
 *
 * @author DToropov
 */

@Configuration
@EnableConfigurationProperties({ProductProperties.class})
public class PropertiesConfig {

}
