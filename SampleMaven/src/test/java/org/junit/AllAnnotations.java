package org.junit;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAnnotations {
	static WebDriver driver;
	/*@BeforeClass
	public static void beforeClass() {
		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Before
	public void before() {
		Date d=new Date(0);
		System.out.println(d);
		
	}
	@Test
	public void test1() {
		driver.findElement(By.id("email")).sendKeys("monyedhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("465431321");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@After
	public void after() {
		Date d=new Date(0); 
		System.out.println(d);
	}
	
	@AfterClass
	public static void afterCalss() {
		driver.quit();
	}*/

}
