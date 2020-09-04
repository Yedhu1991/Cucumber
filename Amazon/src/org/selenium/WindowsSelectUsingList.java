package org.selenium;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class WindowsSelectUsingList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss_2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[1]")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		List<String> allwinli=new LinkedList<String>();
		allwinli.addAll(allwin);
		
		
		driver.switchTo().window(allwinli.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='trustMessage_feature_div']")).click();
		
		Set<String> lastwin = driver.getWindowHandles();
		List<String> lastli=new LinkedList<>();
		lastli.addAll(lastwin);
		
		driver.switchTo().window(lastli.get(2));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//area[@alt='Help']")));
		driver.findElement(By.xpath("//area[@alt='Help']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
