package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.blogherald.com/features/5-other-sites-that-use-frames/");
		List<WebElement> allif = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		driver.switchTo().frame(3);
		driver.switchTo().frame(4);
		
		driver.findElement(By.xpath("sjgfksd")).click();
		driver.switchTo().frame(3);
		driver.switchTo().frame(2);
		driver.switchTo().parentFrame();
		
		
		driver.switchTo().frame("iframe1");
		
		
		
		System.out.println(allif.size());
		}
	
	}


