package org.selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JcPenneyOrdering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");
		Actions as=new Actions(driver);
		Thread.sleep(3000);
		WebElement mv = driver.findElement(By.xpath("(//div[@class='_1X0S7'])[1]"));
		as.moveToElement(mv);
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
	}

}
