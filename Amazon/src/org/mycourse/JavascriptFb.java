package org.mycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement emai = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement btn = driver.findElement(By.id("loginbutton"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','monyedhu@gmail.com')", emai);
		js.executeScript("arguments[0].setAttribute('value','9221165755')", pass);
		js.executeScript("arguments[0].click()", btn);
		
		String em=(String)js.executeScript("return arguments[0].getAttribute('value')", emai);
		String pas=(String)js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(em+"   "+pas);
	
	
	
	
	
	
	}

}
