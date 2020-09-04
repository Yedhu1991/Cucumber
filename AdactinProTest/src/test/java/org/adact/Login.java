package org.adact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement usnm;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement log;

	public WebElement getUsnm() {
		return usnm;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
	
	
	
	
}
	
