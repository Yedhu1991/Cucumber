package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActRoboScreen {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Yedhu\\screenshot\\guru.png");
		FileUtils.copyFile(src, des);
		WebElement bnksrc = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement bnkdes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(bnksrc, bnkdes).perform();
		Thread.sleep(2000);
		ac.contextClick(bnksrc).perform();
		
		
		Thread.sleep(6000);
		driver.close();
	}

}
