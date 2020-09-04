package org.selenium;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src= tk.getScreenshotAs(OutputType.FILE);
	File des= new File("C:\\Users\\Yedhu\\screenshot\\amazon.png");
	FileUtils.copyFile(src, des);
	WebElement scrldwn = driver.findElement(By.xpath("(//a[@class='a-link-normal see-more truncate-1line'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)", scrldwn);
	Thread.sleep(2000);
	WebElement clk = driver.findElement(By.xpath("(//img[@class=\"landscape-image\"])[1]"));
	Actions as=new Actions(driver);
	as.click(clk).perform();
	Set<String> wind = driver.getWindowHandles();
	for(String x:wind) {
		System.out.println(x);
	}
	driver.switchTo().window("https://www.amazon.in/hfc/mobileRecharge?ref_=apay_pc_qc_rech");
	driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
			
	
	

Thread.sleep(3000);
//driver.close();
}
}
