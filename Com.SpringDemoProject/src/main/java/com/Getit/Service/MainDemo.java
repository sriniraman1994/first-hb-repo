package com.Getit.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext( new String [] {"BeanExample.xml"});
	HelperClass obj = (HelperClass)context.getBean("HelperBean");
	System.out.println("First Spring :"+obj.getValue());
	context.close();
}
}
