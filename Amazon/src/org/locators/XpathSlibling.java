package org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSlibling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("(//a[@class='facebook'])[1]//span[@class='soc-font-icon']")).click();
	
	
	
	
	
	
	
	}

}
