package com.study.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CurlingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do fast";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
