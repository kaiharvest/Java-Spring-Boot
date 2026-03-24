package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void beanFactory() {
        ObjectProvider<Foo> foos = applicationContext.getBeanProvider(Foo.class);
        List<Foo> list = foos.stream().collect(Collectors.toList());

        System.out.println(list);

        Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beans);
    }
}
