package ru.dkonyukhov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

//    @Autowired
//    @Qualifier("snils")
//    @Qualifier("pasport")
    private Document document;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setDocument(Document document) {
        this.document = document;
    }

    public String getDocument() {
        return document.getId();
    }
}
