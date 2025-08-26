package com.anand.application.propertiessources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources( value={ @PropertySource("classpath:awsdatabase.properties") ,
                          @PropertySource("classpath:emailcrediential.properties")})
@Configuration
public class SpringBeanConfiguration {
}
