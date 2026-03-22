package com.indra.belajar_spring_dasar.service;

import com.indra.belajar_spring_dasar.repository.CustomersRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomersService {

    @Getter
    @Autowired
    private CustomersRepository normalCustomersRepository;

    @Getter
    @Autowired
    private CustomersRepository premiumCustomersRepository;
}
