package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  {

	public static WebDriver driver;
	
@Given("User have to enter facebook login page")
public void user_have_to_enter_facebook_login_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
    
}

@When("User have to enter username {string} and password {string}")
public void user_have_to_enter_username_and_password(String user, String pass) {
	
	WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
	txtUsername.sendKeys(user);
	
	WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPass.sendKeys(pass);
		
    
}

@When("User have to click a login button")
public void user_have_to_click_a_login_button() throws InterruptedException {
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    btnLogin.click();
	Thread.sleep(3000);
}

@Then("User have to be in invalid credentials page")
public void user_have_to_be_in_invalid_credentials_page() {
	
	String url = driver.getCurrentUrl();
	Assert.assertTrue("check the url page", url.contains("privacy_mutation_token"));
	
}

@When("User has to click the login button without entering credentials")
public void user_has_to_click_the_login_button_without_entering_credentials() throws InterruptedException {
    
	WebElement btnLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    btnLogin.click();
	Thread.sleep(3000);
	
}

@Then("User should be in invalid credential page")
public void user_should_be_in_invalid_credential_page() {
	
	String url = driver.getCurrentUrl();
	Assert.assertTrue("check the url page", url.contains("privacy_mutation_token"));
   
}

}
