package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;

public class FooConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
