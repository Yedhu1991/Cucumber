package org.adact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement rdobtn;
	@FindBy(id="continue")
	private WebElement btn;
	public WebElement getRdobtn() {
		return rdobtn;
	}
	public WebElement getBtn() {
		return btn;
	}

}
