package org.testngpara;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExecutableParaWithHard {
	
	@Parameters({"url","username","password"})
	@Test
	//used Assert(hard assert)
	public void test1(String ur,String un,String pas) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(ur);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		Assert.assertTrue(driver.getTitle().contains("Next Generation"));
		WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys(un);
		Assert.assertEquals("yedhumon123", un);
		WebElement upas = driver.findElement(By.id("usrPwd"));
		upas.sendKeys(pas);
		Assert.assertEquals("Yedhu123456", pas);
		WebElement upascon = driver.findElement(By.id("cnfUsrPwd"));
		upascon.sendKeys(pas);
		Assert.assertEquals("Yedhu323456", pas);
		Thread.sleep(4000);
		driver.quit();
	}
	@Parameters({"url","username","password"})
	@Test
	public void test2(String ur,String un,String pas) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(ur);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			SoftAssert s=new SoftAssert();
		s.assertTrue(driver.getTitle().contains("Next Generation"));
		WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys(un);
		s.assertEquals("yedhumon123", un);
		WebElement upas = driver.findElement(By.id("usrPwd"));
		upas.sendKeys(pas);
		s.assertEquals("Yedhu10023456", pas);
		WebElement upascon = driver.findElement(By.id("cnfUsrPwd"));
		upascon.sendKeys(pas);
		s.assertEquals("Yedhu123456", pas);
		//s.assertAll();
	}
}
