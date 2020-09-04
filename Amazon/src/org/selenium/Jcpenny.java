package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jcpenny {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.jcpenney.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Yedhu\\screenshot\\jcpenney.png");
	FileUtils.copyFile(src, des);
	WebElement shop = driver.findElement(By.xpath("//button[@id='shopDepartmentBtn']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(shop).perform();
	Thread.sleep(3000);
	WebElement win = driver.findElement(By.xpath("(//li[@class=\"_2C7xX\"])[6]"));
	ac.moveToElement(win).perform();
	Thread.sleep(2000);
	WebElement cur=driver.findElement(By.xpath("//li[@id='subMenuLevel3:1']"));
	ac.moveToElement(cur).click().build().perform();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('hi yedhu')");
	
	
	
			
	Thread.sleep(3000);
	driver.close();
}
}
