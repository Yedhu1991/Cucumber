package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelPojo extends BaseClass {
	public HotelSelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radbtn;
	@FindBy(id="continue")
	private WebElement conti;
	public WebElement getRadbtn() {
		return radbtn;
	}
	public WebElement getConti() {
		return conti;
	}
	
	

}
