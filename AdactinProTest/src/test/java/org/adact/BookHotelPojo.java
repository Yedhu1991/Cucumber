package org.adact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement fnam;

@FindBy(id="last_name")
private WebElement lstnam;

@FindBy(id="address")
private WebElement addr;

@FindBy(id="cc_num")
private WebElement crdnum;

@FindBy(id="cc_type")
private WebElement crdtype;

@FindBy(id="cc_exp_month")
private WebElement crdmon;

@FindBy(id="cc_exp_year")
private WebElement crdyr;

@FindBy(id="cc_cvv")
private WebElement cvv;
 @FindBy(id="book_now")
 private WebElement book;
public WebElement getFnam() {
	return fnam;
}
public WebElement getLstnam() {
	return lstnam;
}
public WebElement getAddr() {
	return addr;
}
public WebElement getCrdnum() {
	return crdnum;
}
public WebElement getCrdtype() {
	return crdtype;
}
public WebElement getCrdmon() {
	return crdmon;
}
public WebElement getCrdyr() {
	return crdyr;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
 





}



