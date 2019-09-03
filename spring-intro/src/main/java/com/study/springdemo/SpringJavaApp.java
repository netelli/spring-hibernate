package com.study.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJavaApp {
    public static void main(String[] args) {

        //load the spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(String.valueOf(SpringJavaApp.class.getResource("/applicationContext.xml")));

        //retrieve bean from spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());


        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
