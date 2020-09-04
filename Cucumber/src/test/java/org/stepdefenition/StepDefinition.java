package org.stepdefenition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("launch the google chrome")
	public void launch_the_google_chrome() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Cucumber\\divv\\chromedriver.exe");
	   driver=new ChromeDriver();
	   
	}

	@Given("useer enter the fb page")
	public void useer_enter_the_fb_page() throws InterruptedException {
		driver.get("https://en-gb.facebook.com/login/");
		   Thread.sleep(2000);
	}

	@When("user entere the usernaame and password")
	public void user_entere_the_usernaame_and_password() {
	    driver.findElement(By.id("email")).sendKeys("monyedhu@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("9023123123");
	    driver.findElement(By.id("loginbutton")).click();
	}

	@Then("useer navigates to the home page")
	public void useer_navigates_to_the_home_page() {
	Assert.assertTrue(driver.getTitle().contains("home"));
	
	}




}
