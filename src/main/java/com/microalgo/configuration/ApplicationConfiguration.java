package com.microalgo.configuration;

import com.microalgo.service.StringServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public StringServices getStringService(){
        return new StringServices();
    }
}
