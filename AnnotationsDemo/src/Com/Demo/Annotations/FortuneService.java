package Com.Demo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "you'll be doing fantastic in HUE .you'll improve a lot and you'll be shining";
	}

}
