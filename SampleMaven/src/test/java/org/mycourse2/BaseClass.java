package org.mycourse2;

import java.sql.Driver;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void winhand(int a) {
		Set<String> allwin = driver.getWindowHandles();
		List<String> allli=new LinkedList<String>();
		allli.addAll(allwin);
		driver.switchTo().window(allli.get(a));
	
	}
	
	
	
	
	
	
	
	
	
	
}
