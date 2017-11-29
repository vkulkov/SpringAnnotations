package com.springinaction.annotations.autowired;

import com.springinaction.general.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/annotations-autowire.xml");

        Performer stevie = (Performer) context.getBean("instrumentalist");
        stevie.perform();
    }
}
