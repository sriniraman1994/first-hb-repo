package Com.Demo.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Autowired
    Fortune defFortune;
	@Value("swim for 20  meters")
	private String task;
	@Override
	public String GetTask() {
		return task;
	}

	@Override
	public String showFortune() {
		return defFortune.getFortune();
	}

}
