package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionDrop {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Amazon\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/automation-practice-form/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Yedhu\\screenshot\\demo.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement lst = driver.findElement(By.xpath("//ul[@id='beverages']"));
		js.executeScript("arguments[0].scrollIntoView(true)",lst);
		Thread.sleep(2000);
		WebElement multi = driver.findElement(By.id("continentsmultiple"));
		Select s=new Select(multi);
		List<WebElement> all = s.getOptions();
		for(WebElement w:all) {
			System.out.println(w.getText());
		}
		for(int i=0;i<all.size();i++) {
			if(i%2==1) {
			s.selectByIndex(i);}}
			List<WebElement> allsel = s.getAllSelectedOptions();
			for(int j=0;j<allsel.size();j++) {
				System.out.println(allsel.get(j).getText());
			}
		int num=allsel.size();
		s.deselectByIndex(num-1);
		for(int j=0;j<allsel.size();j++) {
			System.out.println(allsel.get(j).getText());}
			
	
		
	Thread.sleep(6000);
	driver.close();
	

}}

//System.out.println("by index");
//to get the values of drop down using index value 
/*for(int i=0;i<all.size();i++) {
		s.selectByIndex(i);
		WebElement txt=all.get(i);
		String each = txt.getText();
		System.out.println(each);
}*/
//System.out.println("by visible text");
//to get the values based on the visible text
/*for(int i=0;i<all.size();i++) {
WebElement vis = all.get(i);
String vistxt = vis.getText();
System.out.println(vistxt);
s.selectByVisibleText(vistxt);
}*/
/*System.out.println("by value");
//to get the values based on values
for(int i=0;i<all.size();i++) {
	WebElement valget = all.get(i);
	valget.getText()
}
*/
//using selectbyvalue 
/*for(int i=0;i<all.size();i++) {
WebElement attrall = all.get(i);
String atrtxt = attrall.getAttribute("value");
System.out.println(atrtxt);
s.selectByValue(atrtxt);
}*/
//to get previous of last index value 
/*int num = all.size();
WebElement last = all.get(num-1);
String text = last.getText();
System.out.println(text);*/


