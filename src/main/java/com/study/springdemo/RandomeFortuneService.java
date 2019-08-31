package com.study.springdemo;


import java.util.Random;

public class RandomeFortuneService implements FortuneService {
    private Random rand = new Random();

    @Override
    public String getFortune() {
        String[] fortunes = new String[]{"Lucky day #1", "Another lucky", "One more lucky day"};
        return fortunes[rand.nextInt(fortunes.length)];
    }
}
