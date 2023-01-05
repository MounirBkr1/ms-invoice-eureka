package com.ensa.msinvoice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class invoiceConfig {
    @Bean
    /*
        avoid confusion in case there are several instances of a microservice
        if 2 instance is active,"httprequest"  wil call the first instance in first time
        if smae "httprequest" called, the second instance of this microservice will be called
     */
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
