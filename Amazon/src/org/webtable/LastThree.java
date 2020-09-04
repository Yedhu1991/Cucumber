package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastThree {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> alltr = driver.findElements(By.tagName("tr"));
		for(int i=alltr.size()-3;i<alltr.size();i++) {
			WebElement eachrow = alltr.get(i);
			String name = eachrow.getText();
		System.out.println(name);
		
		}
		
		
		
	}

}
