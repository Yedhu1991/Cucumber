package org.selenium;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss_2");
		List<WebElement> alllist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(int i=0;i<alllist.size();i++) {
			WebElement eachdata = alllist.get(i);
			String name=eachdata.getText();
			if(name.contains("Redmi")) {
				System.out.println(name);
			}
		}
	}

}
