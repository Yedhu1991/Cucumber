package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableGoutham {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for(WebElement x:allrow) {
			
		}
			List<WebElement> alldata = driver.findElements(By.tagName("td"));
			for(WebElement y:alldata) {
				String name= y.getText();
				if(name.equals("Mecca")) {
					System.out.println(name);
					}
				}
	
			/*List<WebElement> allrowlast3 = driver.findElements(By.tagName("tr"));
			//int a=allrowlast3.size()/2;
			WebElement w=allrowlast3.get(allrowlast3.size()/2);
			System.out.println(w.getText());
			System.out.println("==================================");
			for(int i=allrowlast3.size()-15;i<allrowlast3.size();i++) {
				WebElement ws = allrowlast3.get(i);
			System.out.println(ws.getText());
			}
		*/
	
	
	
	
	
	
	
	
	}
}
