package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularRow {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> allrow = driver.findElements(By.tagName("tr"));
	for(int i=0;i<allrow.size();i++) {
		WebElement rw = allrow.get(i);
		String name = rw.getText();
		//System.out.println(name);
		if(name.contains("Taiwan")) {
			System.out.println(name);	
		}
		
		}
	

	
}

}


