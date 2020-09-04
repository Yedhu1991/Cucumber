package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLog extends BaseClass {
	public FaceBookLog() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(id="loginbutton")
	private WebElement btn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass; 
	}
	public WebElement getBtn() {
		return btn;
	}
	
}
