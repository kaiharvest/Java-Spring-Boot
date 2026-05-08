package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.listener.LoginAgainSuccessListener;
import com.indra.belajar_spring_dasar.listener.LoginSuccessListener;
import com.indra.belajar_spring_dasar.listener.UserListener;
import com.indra.belajar_spring_dasar.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEven() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("indra", "indra");
        userService.login("indra", "salah");
        userService.login("dwi", "salah");
    }
}
