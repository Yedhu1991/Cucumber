package org.junitclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement user;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement btn;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getBtn() {
	return btn;
}	
}
