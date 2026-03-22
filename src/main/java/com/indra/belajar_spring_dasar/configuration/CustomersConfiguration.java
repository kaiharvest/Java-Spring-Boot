package com.indra.belajar_spring_dasar.configuration;

import com.indra.belajar_spring_dasar.repository.CustomersRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomersConfiguration {

    public CustomersRepository normalCustomersRepository() {
        return new CustomersRepository();
    }

    public CustomersRepository premiumCustomersRepository() {
        return new CustomersRepository();
    }
}
