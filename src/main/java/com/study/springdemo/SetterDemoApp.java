package com.study.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(String.valueOf(SetterDemoApp.class.getResource("/applicationContext.xml")));

        //retrieve bean from spring container
        CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(myCricketCoach.getDailyFortune());
        System.out.println(myCricketCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
