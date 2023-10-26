package linkedlearning.CucumberEssT.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MenuHook {
	
	@Before("@SmokeTest")
	public void beforeDisplayMessage(Scenario sc) {
		System.out.println("Start test: " + sc.getName() );
	}

	@After("@SmokeTest")
	public void afterDisplayMessage(Scenario sc) {
		System.out.println("End test: " + sc.getName() );
	}
}
