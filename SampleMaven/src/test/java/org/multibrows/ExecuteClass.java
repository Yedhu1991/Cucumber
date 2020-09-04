package org.multibrows;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExecuteClass {
	public WebDriver driver=null;
	@Parameters({"browser"})
	@Test
	public void test1(String s) {
		if(s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(s.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
	}
	

}
