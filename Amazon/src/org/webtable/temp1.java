package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class temp1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> alltr = driver.findElements(By.tagName("tr"));
	//System.out.println(alltr.get(alltr.size()/2).getText());
	for(int i=alltr.size()-3;i<alltr.size();i++) {
		System.out.println(alltr.get(i).getText());
	}
	for(int j=0;j<3;j++) {
		System.err.println(alltr.get(j).getText());
	}


}
}
