package org.stepdefinition3;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 {
	WebDriver driver;
	@Given("launch chrome and open the application")
	public void launch_chrome_and_open_the_application() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://www.demo.guru99.com/telecom/");
		   driver.manage().window().maximize();
	}

	@When("click add to button enter the customer details")
	public void click_add_to_button_enter_the_customer_details(io.cucumber.datatable.DataTable dt) throws InterruptedException {
		driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
		Thread.sleep(2000);
		List<List<String>> li = dt.asLists(String.class);
		driver.findElement(By.id("fname")).sendKeys(li.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(li.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(li.get(0).get(2));
		driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(li.get(0).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(li.get(1).get(4));
	}

	@When("click the submit button now")
	public void click_the_submit_button_now() {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@name='submit']")));
	}

	@Then("check uid is generated correct")
	public void check_uid_is_generated_correct() throws InterruptedException {
		String uid = driver.getCurrentUrl();
		   Assert.assertTrue(uid.contains("uid"));
		   Thread.sleep(3000);
		   driver.quit();
	}

}
