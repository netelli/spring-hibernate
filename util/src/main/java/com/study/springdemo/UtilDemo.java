package com.study.springdemo;

public class UtilDemo {
    public static String getResource(Class className, String srcName) {
        return String.valueOf(className.getResource(srcName));
    }
}
