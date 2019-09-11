package com.study.springdemo;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just Do it!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
