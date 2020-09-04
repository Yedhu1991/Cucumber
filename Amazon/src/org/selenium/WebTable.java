package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Yedhu\\screenshot\\demotab.png");
		FileUtils.copyFile(src, des);
		
		//using for loop we fetch the data
		List<WebElement> tbrow = driver.findElements(By.tagName("tr"));
		for(int i=0;i<tbrow.size();i++) {
			WebElement eachrw = tbrow.get(i);}
			List<WebElement> tabda = driver.findElements(By.tagName("td"));
			for(int j=0;j<tabda.size();j++) {
				WebElement tabdeach = tabda.get(j);
				System.out.println(tabdeach.getText());
			}
		
		//using for each we fetch the data
		List<WebElement> trw = driver.findElements(By.tagName("tr"));
		for( WebElement x:trw) {
			List<WebElement> eachtd = x.findElements(By.tagName("td"));
			for(WebElement y:eachtd) {
				System.out.println(y.getText());
			}}
		
		
		
		
		
		
		
		
	
	}
		}
	


