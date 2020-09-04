package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmPojo extends BaseClass{
	public BookConfirmPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@class=\"login\"]")
	private WebElement tabl;
	public WebElement getTabl() {
		return tabl;
	}
	
}
