package org.stepdefiniton1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SStepDefiniton1 {
	WebDriver driver;
	@Given("launch chrome and open facebook app")
	public void launch_chrome_and_open_facebook_app() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Cucumber\\divv\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
	}

	@When("user enters the username and password {string},{string}")
	public void user_enters_the_username_and_password(String string, String string2) {
	   driver.findElement(By.id("email")).sendKeys(string);
	   driver.findElement(By.id("pass")).sendKeys(string2);
	   driver.findElement(By.id("u_0_b")).click();
	}

	@Then("user enters to the home page")
	public void user_enters_to_the_home_page() {
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	   
	}


}
