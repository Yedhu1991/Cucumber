package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabEg1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> litr = driver.findElements(By.tagName("tr"));
		for(WebElement x:litr) {
			System.out.println(x.getText());
		}
		String tem="Taipei 101";
		
		List<WebElement> allth = driver.findElements(By.tagName("th"));
		for(WebElement z:allth) {
			String eachth = z.getText();
			System.out.println(eachth);
	
		if(eachth.equals(tem)) {
			List<WebElement> litd = driver.findElements(By.tagName("td"));
				for(WebElement y:litd) 
				{
					System.out.println(y.getText());
					
				}}
		}
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
