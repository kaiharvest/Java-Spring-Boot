package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    @Test
    void testDependsOn() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
        applicationContext.getBean(Foo.class);
    }
}
