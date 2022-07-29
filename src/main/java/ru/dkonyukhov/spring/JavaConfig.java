package ru.dkonyukhov.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class JavaConfig {

    @Bean
    @Lazy
    public Person getPerson(String name){
        Person person = new Person();
        person.setName(name);
        return person;
    }

}