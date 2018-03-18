package com.Getit.DIandIocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocApp {

	public static void main(String[] args) {
     //IOC Demo:
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"BeanExample.xml"});	
	 Coach theCoach =  (BaseballCoach) context.getBean("BaseballBean");
	 Coach theBasketCoach = (BasketBallCoach)context.getBean("BasketballBean");
	 BasketBallCoach basketCoach = (BasketBallCoach)context.getBean("BasketballBean");
//	 BaseballCoach baseballCoach = (BaseballCoach) context.getBean("BaseballBean");
	 System.out.println("BaseballCoach"+":"+theCoach.getTask());
	 System.out.println("BasketBallCoach"+":"+theBasketCoach.getTask());
	 System.out.println("fortune from baseballcoach:"+"construcorDi"+theCoach.getFortuneValue());
	 System.out.println("fortune from basketballcoach:"+"setterdi"+":"+theBasketCoach.getFortuneValue());
	 System.out.println("using seeter injection for values in basketballcoach:)points:"+basketCoach.getPoints());
	 System.out.println("using seeter injection for values in basketballcoach:)versus:"+basketCoach.getVersus());
	 System.out.println("using seeter injection for values in basketballcoach:)venue:"+basketCoach.getVenue());
	 System.out.println("prop injection:in basketballcoach:)time:"+basketCoach.getTime()+"stadium"+basketCoach.getStadium());
	}

}
