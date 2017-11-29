package com.springinaction.autowiring;

import com.springinaction.general.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/autowiring.xml");

        Performer carl = (Performer) context.getBean("carl");
        Performer duke = (Performer) context.getBean("duke");
        carl.perform();
        duke.perform();
    }
}
