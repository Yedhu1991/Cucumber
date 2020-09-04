package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Yedhu\\screenshot\\fblog.png");
		FileUtils.copyFile(src, des);
		
		//to get all options from select tag
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		List<WebElement> all = s.getOptions();
		for(int i=0;i<all.size();i++) {
			System.out.println(i);
		}
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select(month);
		List<WebElement> allmon = sm.getOptions();
		System.out.println("*******MONTH********");
		for(int i=0;i<allmon.size();i++) {
			WebElement each = allmon.get(i);
			String mnt=each.getText();
			System.out.println(mnt);
		}
		System.out.println("************YEAR**********");
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Select sy=new Select(yr);
		List<WebElement> allyr = sy.getOptions();
		for(int i=0;i<allyr.size();i++) {
			WebElement eachyr = allyr.get(i);
			System.out.println(eachyr.getText());
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
