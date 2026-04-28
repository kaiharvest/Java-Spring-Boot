package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.listener.LoginSuccessListener;
import com.indra.belajar_spring_dasar.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class
    })
    public static class TestConfiguration {

    }

}
