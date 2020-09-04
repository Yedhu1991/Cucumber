package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLastRow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for(int i=allrow.size()-1;i<allrow.size();i++) {
			System.out.println(allrow.get(i).getText());
		}
		
		
		WebElement seclstrow = allrow.get(allrow.size()-2);
		List<WebElement> alldata = seclstrow.findElements(By.tagName("td"));
		for(int i=0;i<alldata.size();i++) {
			System.out.println(alldata.get(i).getText());
		}
	
	}

}
