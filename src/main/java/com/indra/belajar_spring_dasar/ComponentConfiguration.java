package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.indra.belajar_spring_dasar.service",
        "com.indra.belajar_spring_dasar.repository",
        "com.indra.belajar_spring_dasar.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
