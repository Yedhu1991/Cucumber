package org.mycourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firfox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
