package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.service.MerchantService;
import com.indra.belajar_spring_dasar.service.MerchantServiceImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    }

    @Test
    void inheritanceTest() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImp merchantServiceImp = applicationContext.getBean(MerchantServiceImp.class);

        Assertions.assertSame(merchantService, merchantServiceImp);
    }
}
