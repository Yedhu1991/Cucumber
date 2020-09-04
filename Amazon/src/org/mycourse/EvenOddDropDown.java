package org.mycourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvenOddDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/automation-practice-form/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]", driver.findElement(By.id("submit1")));
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("continentsmultiple")));
		List<WebElement> allop = s.getOptions();
		for(int i=0;i<allop.size();i++) {
			WebElement getop = allop.get(i);
			String name = getop.getText();
			int tem=i+1;
			if(tem%2==1) {
				System.out.println(name);
			}
			
		}
		for(int j=0;j<allop.size();j++) {
			WebElement numli = allop.get(j);
			String name = numli.getText();
			int num=j+1;
			System.out.println(num+"."+name);
		}

	
	
	
	
	
	
	}

}
