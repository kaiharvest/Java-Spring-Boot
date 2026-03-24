package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.factory.PaymentGatewayFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayFactoryBean.class
})
public class FactoryConfiguration {

}
