package ru.dkonyukhov.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snils implements Document, InitializingBean {
    @Value("snils")
    private String id;

    @Override
    public String getId() {
        return "Snils: " + id;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init-method " + this.getClass().getSimpleName());
    }
}
