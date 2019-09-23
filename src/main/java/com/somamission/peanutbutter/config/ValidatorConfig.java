package com.somamission.peanutbutter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;

@Configuration
public class ValidatorConfig {

  @Bean
  Validator validator() {
    return Validation.buildDefaultValidatorFactory().getValidator();
  }
}
