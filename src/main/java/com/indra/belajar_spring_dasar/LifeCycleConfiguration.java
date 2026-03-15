package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.data.Connection;
import com.indra.belajar_spring_dasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "Start", destroyMethod = "Stop")
    @Bean
    public Server server() {
        return new Server();
    }
}
