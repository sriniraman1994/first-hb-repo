package Com.Demo.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsIOCDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotDemo.xml");
		Coach coachObj = (Coach)context.getBean("sillyCoach",Coach.class);
		System.out.println(coachObj.GetTask());
		System.out.println("Using Annotations Autowired with constructor :"+coachObj.showFortune());
		context.close();

	}

}
