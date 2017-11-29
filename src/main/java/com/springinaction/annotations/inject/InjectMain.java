package com.springinaction.annotations.inject;

import com.springinaction.general.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/annotations-inject.xml");

        Performer kenny = (Performer) context.getBean("instrumentalist");
        kenny.perform();
    }
}
