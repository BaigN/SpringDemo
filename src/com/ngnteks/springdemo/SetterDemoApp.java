package com.ngnteks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		
		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//call getter methods
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeamName());
		
		//close context
		context.close();
	}

}
