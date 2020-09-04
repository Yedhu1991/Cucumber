package org.mycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptexAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search = driver.findElement(By.xpath("//div[@class='nav-search-field ']"));
		js.executeScript("arguments[0].setAttribute('value','mobile')",search);
		
	String s=(String)js.executeScript("return arguments[0].getAttribute('value')", search);
		System.out.println(s);
		
		
		
		
		WebElement last=driver.findElement(By.xpath("(//li[@class=\"nav_first\"])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",last);
		js.executeScript("window.scrollBy()",12,1000);
	
	
	
	
	
	Thread.sleep(6000);
	driver.close();
	}

}
