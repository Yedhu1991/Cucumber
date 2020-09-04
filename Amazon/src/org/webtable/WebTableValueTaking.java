package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableValueTaking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for(WebElement x:allrow) {
			String name = x.getText();}
			List<WebElement> alldata = driver.findElements(By.tagName("td"));
			for(WebElement y:alldata) {
				System.out.println(y.getText());
				
			}
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
		
	} 

}