package org.task;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void klik(WebElement w) {
		w.click();
	}
	public static void selClass(WebElement w,int a) {
		Select se=new Select(w);
		se.selectByIndex(a);
	}
	public static void clear(WebElement w) {
		w.clear();
	}
	public static void table(WebElement w) {
		List<WebElement> allrow = w.findElements(By.tagName("tr"));
		for(int i=0;i<allrow.size();i++) {
			WebElement eachrow = allrow.get(i);
			System.out.println(eachrow.getText());
		}
	}

	public static void winhand(int a) {
		Set<String> allwin = driver.getWindowHandles();
		List<String>allli=new LinkedList<String>();
		allli.addAll(allwin);
		driver.switchTo().window(allli.get(a));
	}
}
