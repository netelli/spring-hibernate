package com.study.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

   @PostConstruct
    public void doStartupStuff() {
        System.out.println(">> TennisCoach: inside doStartupStuff()");
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println(">> TennisCoach: inside doCleanupStuff()");
    }
}
