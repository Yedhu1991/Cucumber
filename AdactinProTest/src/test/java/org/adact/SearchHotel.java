package org.adact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hot;
	@FindBy(id="room_type")
	private WebElement type;
	@FindBy(id="room_nos")
	private WebElement rono;
	@FindBy(id="datepick_in")
	private WebElement datein;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement adlroom;
	@FindBy(id="child_room")
	private WebElement chroom;
	@FindBy(id="Submit")
	private WebElement submt;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHot() {
		return hot;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getRono() {
		return rono;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdlroom() {
		return adlroom;
	}
	public WebElement getChroom() {
		return chroom;
	}
	public WebElement getSubmt() {
		return submt;
	}

}
