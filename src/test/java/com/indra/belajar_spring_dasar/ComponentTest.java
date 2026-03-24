package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.MultiFoo;
import com.indra.belajar_spring_dasar.repository.CategoryRepository;
import com.indra.belajar_spring_dasar.repository.CustomersRepository;
import com.indra.belajar_spring_dasar.repository.ProductRepository;
import com.indra.belajar_spring_dasar.service.CategoryService;
import com.indra.belajar_spring_dasar.service.CustomersService;
import com.indra.belajar_spring_dasar.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void component() {
        ProductService product1 = applicationContext.getBean(ProductService.class);
        ProductService product2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(product1, product2);
    }

    @Test
    void constructorDependenciesInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void setterDependenciesInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void fieldDependenciesInjection() {
        CustomersService customersService = applicationContext.getBean(CustomersService.class);

        CustomersRepository normalCustomersRepository = applicationContext.getBean("normalCustomersRepository", CustomersRepository.class);
        CustomersRepository premiumCustomersRepository = applicationContext.getBean("premiumCustomersRepository", CustomersRepository.class);

        Assertions.assertSame(normalCustomersRepository, customersService.getNormalCustomersRepository());
        Assertions.assertSame(premiumCustomersRepository, customersService.getPremiumCustomersRepository());
    }

    @Test
    void objectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
