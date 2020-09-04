package org.mycourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://demoqa.com/automation-practice-form/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0]", driver.findElement(By.id("submit1")));
	Thread.sleep(3000);
	 
	Select s=new Select(driver.findElement(By.id("continents")));
	//select the value by index
	s.selectByValue("AS");

	
	Thread.sleep(3000);
	//get all the text present inside dropdown
	List<WebElement> se = s.getOptions();
	for(WebElement x:se) {
		System.out.println(x.getText());
		}
System.out.println(s.isMultiple());
	
	
	
	
	
	
	
	Thread.sleep(6000);
	driver.close();
	}
}