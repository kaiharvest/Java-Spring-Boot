package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeenConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }

}
