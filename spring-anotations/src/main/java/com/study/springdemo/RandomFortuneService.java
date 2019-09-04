package com.study.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };
    Random random = new Random();

    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];
    }
}
