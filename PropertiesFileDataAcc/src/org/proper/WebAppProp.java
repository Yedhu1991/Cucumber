package org.proper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppProp {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\PropertiesFileDataAcc\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\PropertiesFileDataAcc\\Properties\\Webdata.properties");
		FileInputStream os=new FileInputStream(f);
		Properties p=new Properties();
		p.load(os);
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("emailx"))).sendKeys(p.getProperty("emailv"));
		driver.findElement(By.xpath(p.getProperty("passx"))).sendKeys(p.getProperty("passv"));
		driver.findElement(By.xpath(p.getProperty("login"))).click();
	
	
	
	}

}
