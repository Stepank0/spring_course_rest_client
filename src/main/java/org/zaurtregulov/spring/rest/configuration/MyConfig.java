package org.zaurtregulov.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.zaurtregulov.spring.rest")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate() { // Класс для совершение HTTP requests
    return new RestTemplate();
    }
}
