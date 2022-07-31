package ru.dkonyukhov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        Person person = javaConfigContext.getBean(Person.class);
        getInfo(person);
        javaConfigContext.close();

    }

    private static void getInfo(Person person) {
        //System.out.println(person.getName());
        System.out.println(person.getDocument());
    }

}

