package com.indra.belajar_spring_dasar.configuration;

import com.indra.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
