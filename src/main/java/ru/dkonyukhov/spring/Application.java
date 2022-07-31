package ru.dkonyukhov.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        Person person = javaConfigContext.getBean(Person.class);
        getInfo(person);
        javaConfigContext.close();

        String[] names = javaConfigContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
//            BeanDefinition beanDefinition = javaConfigContext.getBeanDefinition(name);
//            System.out.println(beanDefinition);
        }

    }

    private static void getInfo(Person person) {
        //System.out.println(person.getName());
        System.out.println(person.getDocument());
    }

}

