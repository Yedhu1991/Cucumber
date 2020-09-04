package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableExam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		List<WebElement> alldata = driver.findElements(By.tagName("td"));	
		for(WebElement y:alldata) {
			String name = y.getText();
			if(name.equals("Taiwan")) {
				System.out.println(y.getText());
			}
		}
	
	
	
		}
	
	
}


