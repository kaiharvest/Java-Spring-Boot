package com.indra.belajar_spring_dasar.application;

import com.indra.belajar_spring_dasar.data.Bar;
import com.indra.belajar_spring_dasar.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

public class FooApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FooApplication.class, args);
        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo(Bar bar) {
        return new Foo();
    }

}
