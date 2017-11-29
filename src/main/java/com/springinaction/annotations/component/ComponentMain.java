package com.springinaction.annotations.component;

import com.springinaction.general.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/annotations-component.xml");

        Performer eddie = (Performer) context.getBean("eddie");
        eddie.perform();
    }
}
