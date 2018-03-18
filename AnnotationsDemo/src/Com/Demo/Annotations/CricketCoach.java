package Com.Demo.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sillyCoach")

public class CricketCoach implements Coach {
    @ Autowired
    @ Qualifier("defaultFortune")
	private Fortune goodFortune; 
	@Override
	public String GetTask() {
		// TODO Auto-generated method stub
		return "Do Fast Bowling for 8 overs ";
	}
	@PostConstruct
	public void startMetod(){
		System.out.println("Bean init");
	}
	@PreDestroy
	public void endMethod(){
		System.out.println("Bean destroy");
	}
	
	/* this code is for constructor autowired injection
//	@ Autowired
//	public CricketCoach(Fortune goodFortune) {
//		super();
//		this.goodFortune = goodFortune;
//	}*/
	
	
	
	@Override
	public String showFortune() {
		// TODO Auto-generated method stub
		return goodFortune.getFortune();
	}

//	public Fortune getGoodFortune() {
//		return goodFortune;
//	}
//	@Autowired
//	public void setGoodFortune(Fortune goodFortune) {
//		this.goodFortune = goodFortune;
//	}

	

}
