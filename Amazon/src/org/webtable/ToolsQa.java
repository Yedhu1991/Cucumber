package org.webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
}
}
