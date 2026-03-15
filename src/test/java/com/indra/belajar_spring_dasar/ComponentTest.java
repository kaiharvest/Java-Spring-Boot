package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    @Test
    void component() {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        ProductService product1 = applicationContext.getBean(ProductService.class);
        ProductService product2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(product1, product2);
    }
}
