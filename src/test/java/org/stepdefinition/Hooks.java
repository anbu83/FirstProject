package org.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {

	
	@Before
	public void befSce() {
		System.out.println("Scenario starts...");
		
		
		
	}
	
	@After
	public void aftSce() {
			System.out.println("Scenario ends....");
			StepDefinition.driver.quit();
			
	}
		
}
