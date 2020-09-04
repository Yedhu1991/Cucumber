package org.mycourse;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[6]")).click();
		Set<String> all = driver.getWindowHandles();
		System.out.println(all.size());
	}

}
