package com.Getit.DIandIocDemo;

public class BaseballCoach implements Coach {
	private Fortune fortune;
 //Constructor Injection
	public BaseballCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	public String getTask() {
		return "Do Catch practice for 30 mins";
	}

	public String getFortuneValue() {
		return fortune.getFortune();
	}
	public void startMethod(){
		System.out.println("tis is overriden init method");
	}
	public void endMethod(){
		System.out.println("this is overriden destroy method");
	}

}
