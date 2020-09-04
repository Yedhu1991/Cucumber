package org.junitclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launch(String s) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"//div//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
	}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void klick(WebElement w) {
		w.click();
	}
	
	
	
	
}
