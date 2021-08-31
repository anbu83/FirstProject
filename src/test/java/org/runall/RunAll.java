package org.runall;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",tags= {"not @Smoke"})
public class RunAll {
	
	@AfterClass
	public static void reportGeneration() {
		
		


}
	
}
