package com.indra.belajar_spring_dasar;

import com.indra.belajar_spring_dasar.service.MerchantServiceImp;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImp.class
})
public class InheritanceConfiguration {
}
