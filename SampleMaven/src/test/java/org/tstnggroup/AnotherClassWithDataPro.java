package org.tstnggroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnotherClassWithDataPro extends ExtenDataPro{

	@Test(dataProviderClass=ExtenDataPro.class,dataProvider="data")
	public void test(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.id("loginbutton")).click();
		driver.quit();
	
	}
}
