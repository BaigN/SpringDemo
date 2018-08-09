package com.ngnteks.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeamName() {
		return teamName;
	}	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach- inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public void setTeamName(String teamName) {
		System.out.println("CricketCoach- inside setter method - setTeamName");
		this.teamName = teamName;
	}
	//create a no-args constructor
	public CricketCoach() {
		System.out.println("CricketCoach- inside no-args constructor");
	}
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach- inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes a day!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
