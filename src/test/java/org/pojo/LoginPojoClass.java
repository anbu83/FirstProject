package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends BaseClass {

	public LoginPojoClass() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnClick;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
}
