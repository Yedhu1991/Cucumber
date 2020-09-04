package org.mycourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/automation-practice-form/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]", driver.findElement(By.id("submit1")));
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("continentsmultiple")));
		for(int i=0;i<3;i++) {
			s.selectByIndex(i);
		}
		List<WebElement> selall = s.getAllSelectedOptions();
		for(WebElement x:selall) {
			//System.out.println(x.getText());
		}
		//System.out.println("==========================");
	WebElement self = s.getFirstSelectedOption();
		//System.out.println(self.getText());
		
	//System.out.println("=======================");
	//System.out.println(s.getFirstSelectedOption().getText());
	List<WebElement> all = s.getOptions();
	for(int i=all.size()-3;i<all.size();i++) {
		System.out.println(all.get(i).getText());
	}
	s.deselectByIndex(1);
	
	List<WebElement> allselop = s.getAllSelectedOptions();
	for(WebElement x:allselop) {
		//System.out.println(x.getText());
	}
	
	for(int i=0;i<all.size();i++) {
		WebElement alleven = all.get(i);
		
		if(i%2==0)
		{
			String each = alleven.getText();
		}
	
		
	}
	
	
	
	Thread.sleep(6000);
	driver.close();
	
	}

}
