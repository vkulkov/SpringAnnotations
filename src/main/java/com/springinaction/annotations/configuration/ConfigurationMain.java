package com.springinaction.annotations.configuration;

import com.springinaction.general.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/annotations-configuration.xml");

        Performer duke = (Performer) context.getBean("duke");
        Performer kenny = (Performer) context.getBean("kenny");
        duke.perform();
        kenny.perform();
    }
}
