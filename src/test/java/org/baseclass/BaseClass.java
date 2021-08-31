package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver launchBrowser() {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	public static void fill(WebElement e, String s) {
		e.sendKeys(s);

	}
	
	public static void btnClick(WebElement e) {
		e.click();

	}
	
}
