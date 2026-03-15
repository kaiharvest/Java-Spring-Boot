package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Bar;
import org.springframework.context.annotation.Bean;

public class BarConfiguration {
    @Bean
    public Bar bar() {
        return new Bar();
    }
}
