package com.study.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GolfJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GolfConfig.class);

        Coach coach = context.getBean("golfCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
