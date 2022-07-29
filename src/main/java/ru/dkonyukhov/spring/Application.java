package ru.dkonyukhov.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) {
		ApplicationContext javaConfigContext =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		for (String str : javaConfigContext.getBeanDefinitionNames()){
			System.out.println(str);
		}
		//printLoadedClasses(classFilter);
		Person person = javaConfigContext.getBean(Person.class, "233");
		System.out.println(person.getName());
	}

}

