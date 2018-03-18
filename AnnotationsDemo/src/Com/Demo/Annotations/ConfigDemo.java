package Com.Demo.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);
		CricketCoach coach = context.getBean(arg0)
	}

}
