package org.testmaven;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtendsClass extends BaseClass {
public static void main(String[] args) throws AWTException, IOException {
	lauch("https://www.facebook.com/");
	WebElement ema = driver.findElement(By.id("email"));
	send(ema, getData(3, 0));
	tab(1);
	WebElement pas = driver.findElement(By.id("pass"));
	send(pas, getData(3, 2));
	tab(1);
	WebElement log = driver.findElement(By.id("u_0_b"));
	klick(log);
	
	
	
	
}
}
