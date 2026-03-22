package com.indra.belajar_spring_dasar.service;

import com.indra.belajar_spring_dasar.repository.CustomersRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomersService {

    @Getter
    @Autowired
    @Qualifier("normalCustomersRepository")
    private CustomersRepository normalCustomersRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustomersRepository")
    private CustomersRepository premiumCustomersRepository;
}
