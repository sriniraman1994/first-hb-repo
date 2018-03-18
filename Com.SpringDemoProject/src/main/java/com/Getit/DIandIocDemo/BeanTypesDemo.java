package com.Getit.DIandIocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTypesDemo {
  public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext(new String[]{"BeanTypesDemo.xml"});
	BaseballCoach coach1 = (BaseballCoach)context.getBean("BaseballBean");
	BaseballCoach coach2 = (BaseballCoach) context.getBean("BaseballBean");
	boolean singletonCheck = coach1==coach2;
	System.out.println(singletonCheck);
	System.out.println(coach1);
	System.out.println(coach1.getTask());
	System.out.println(coach2.getTask());
}
}
