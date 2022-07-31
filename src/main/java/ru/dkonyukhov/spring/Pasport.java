package ru.dkonyukhov.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("pasport")
public class Pasport implements Document {
    private String id;

    @Override
    public String getId() {
        return "Pasport: " + id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Init-method " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy-method " + this.getClass().getSimpleName());
    }
}
