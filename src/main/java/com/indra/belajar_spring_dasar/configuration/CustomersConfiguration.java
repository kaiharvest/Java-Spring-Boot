package com.indra.belajar_spring_dasar.configuration;

import com.indra.belajar_spring_dasar.repository.CustomersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomersConfiguration {

    @Primary
    @Bean
    public CustomersRepository normalCustomersRepository() {
        return new CustomersRepository();
    }

    @Bean
    public CustomersRepository premiumCustomersRepository() {
        return new CustomersRepository();
    }
}
