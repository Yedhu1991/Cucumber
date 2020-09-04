package org.tstnggroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="data")
	public void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.id("loginbutton")).click();
		driver.quit();
	
	}
	@org.testng.annotations.DataProvider(name="data")
	public Object[][] dataPro()
		{
		return new Object[][]{{"monyedhu@gmail.com","9020465722"},
								{"clanyedhu@gmail.com","461324"},
								{"manu@gmail.com","564654646"}
							   };
			
		}

	
	
}
