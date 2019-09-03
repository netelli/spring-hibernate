package com.study.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it: " + fortuneService.getFortune();
    }

    //add init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside doMyStartupStuff method");
    }

    //add destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside doMyCleanupStuff method");
    }

}










