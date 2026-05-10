package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Bar;
import com.indra.belajar_spring_dasar.data.Foo;
import com.indra.belajar_spring_dasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependenceInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }
    @Bean
    public Foo foooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooFirst") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}