package org.selenium;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;

public class Dynamictable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-table/");
		//to find the row of
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for(int i=0;i<allrow.size();i++) {
			WebElement eachrow = allrow.get(i);
			String nam = eachrow.getText();
			//System.out.println(rowtxt);
				List<WebElement> alltd =eachrow.findElements(By.tagName("td"));
				for(int j=0;j<alltd.size();j++) {
					WebElement eachdata = alltd.get(j);
					String name = eachdata.getText();
					if(name.equals("UAE")) {
						System.out.println(nam);
				}
			}
		}
	
	Thread.sleep(3000);
	driver.close();
	}

}
