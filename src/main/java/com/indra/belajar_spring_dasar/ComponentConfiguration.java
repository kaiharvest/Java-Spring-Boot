package com.indra.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.indra.belajar_spring_dasar.service"
})
public class ComponentConfiguration {
}
