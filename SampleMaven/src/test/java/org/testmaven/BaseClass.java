package org.testmaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.utils.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.session.ChromeFilter;

public class BaseClass {
	static WebDriver driver;
	public static void lauch (String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
	}
	public static void send(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void tab(int num) throws AWTException {
		Robot r=new Robot();
		for(int i=1;i<=num;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
	}}
	public static void klick(WebElement w) {
	w.click();
	}
	public static String getData(int a,int b) throws IOException {
		String name;
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\excel\\DataDrivenExcel.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(a);
		Cell c = r.getCell(b);
		int typ = c.getCellType();
		if(typ==1) {
			 name = c.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dd = c.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat();
				 name = sf.format(dd);
			}
			else
			{
				double dc = c.getNumericCellValue();
				long ld=(long)dc;
				name = String.valueOf(ld);
			}
		}
		return name;
	}


	

}
