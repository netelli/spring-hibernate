package com.study.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		// com.study.springdemo.Coach theCoach = new com.study.springdemo.BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
