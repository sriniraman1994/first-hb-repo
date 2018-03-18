package Com.Demo.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigDemo {
@Bean
public Fortune getFortuneObject(){
	return new FortuneService();
}
@Bean
public Coach coachBean(){
	return new CricketCoach();
}
}
