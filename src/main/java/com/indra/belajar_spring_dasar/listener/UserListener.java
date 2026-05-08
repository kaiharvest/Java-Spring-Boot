package com.indra.belajar_spring_dasar.listener;

import com.indra.belajar_spring_dasar.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener(LoginSuccessEvent event) {
        log.info("Success login again for User {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener2(LoginSuccessEvent event) {
        log.info("Success login again for User {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener3(LoginSuccessEvent event) {
        log.info("Success login again for User {}", event.getUser());
    }

}
