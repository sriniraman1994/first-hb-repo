package Com.Demo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class DefaultFortune implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "good Luck!";
	}

}
