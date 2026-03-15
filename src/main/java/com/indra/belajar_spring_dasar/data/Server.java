package com.indra.belajar_spring_dasar.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    public void Start() {
        log.info("Strat Server");
    }

    @PreDestroy
    public void Stop() {
        log.info("Stop Server");
    }
}
