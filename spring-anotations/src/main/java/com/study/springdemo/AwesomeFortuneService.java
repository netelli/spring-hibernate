package com.study.springdemo;

public class AwesomeFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is better thing";
    }
}
