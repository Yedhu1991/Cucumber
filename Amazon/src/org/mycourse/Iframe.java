package org.mycourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/iframe-practice-page/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(all.get(0));
		driver.findElement(By.xpath("(//span[@class=\"menu-text\"])[1]")).click();
		
	
	
	Thread.sleep(6000);
	driver.close();
	}

}
