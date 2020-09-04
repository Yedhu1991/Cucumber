package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iInterExplorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
	}

}
