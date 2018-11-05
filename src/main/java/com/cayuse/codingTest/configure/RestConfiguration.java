package com.cayuse.codingTest.configure;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Rest Configuration
 * @author ningm
 *
 */
@Configuration
public class RestConfiguration {
 
    /**
     * instantiate RestTemplate object using RestTemplateBuilder
     * @return RestTemplate
     */
    @Bean 
    public RestTemplate restTemplate(RestTemplateBuilder builder) {  
        return builder.build();  
    }
 
}
