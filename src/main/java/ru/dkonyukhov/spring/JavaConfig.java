package ru.dkonyukhov.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class JavaConfig {

    @Bean("pas1")
    public Document getPas1() {
        Pasport pasport = new Pasport();
        pasport.setId("pas1");
        return pasport;
    }

    @Bean("pas2")
    @Primary
    public Document getPas2() {
        Pasport pasport = new Pasport();
        pasport.setId("pas2");
        return pasport;
    }
}
