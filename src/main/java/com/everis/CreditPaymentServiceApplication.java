package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Configuracion del Servicio y Eureka.
 */
@SpringBootApplication
@EnableEurekaClient
public class CreditPaymentServiceApplication {

  /** Principal. */
  public static void main(String[] args) {
  
    SpringApplication.run(CreditPaymentServiceApplication.class, args);
  
  }

}
