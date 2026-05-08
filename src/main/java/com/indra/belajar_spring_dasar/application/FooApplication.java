package com.indra.belajar_spring_dasar.application;

import com.indra.belajar_spring_dasar.data.Foo;
import com.indra.belajar_spring_dasar.listener.AddStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class FooApplication {

//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(FooApplication.class, args);
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

//    @Bean
//    public Foo foo() {
//        return new Foo();
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setListeners(List.of(new AddStartingListener()));

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }

}
