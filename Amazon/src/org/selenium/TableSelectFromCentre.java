package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSelectFromCentre {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		/*
		// print the row which is in centre
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		int num = allrow.size();
		System.out.println(allrow.get(num/2).getText());*/
		List<WebElement> alldata = driver.findElements(By.tagName("td"));
		for(int i=0;i<alldata.size();i++) {
			WebElement each = alldata.get(i);
			String name = each.getText();
			if(name.equals("Taiwan")) {
				System.out.println(name);
			}
			
		}
		
		
		
		
		}
			
		
}
