package org.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	WebDriver driver;
	@Given("launch the  chrome")
	public void launch_the_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\Cucumber\\divv\\chromedriver.exe");
		   driver=new ChromeDriver(); 
	}
	@Given("user enter the fb page")
	public void user_enter_the_fb_page() throws InterruptedException {
		driver.get("https://en-gb.facebook.com/login/");
		   Thread.sleep(2000);
	}
	@When("user entere usernaame and password")
	public void user_entere_usernaame_and_password() {
		driver.findElement(By.id("email")).sendKeys("monyedhu@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("456313131");
	    driver.findElement(By.id("loginbutton")).click();
	}
	@Then("useer navigates to  home page")
	public void useer_navigates_to_home_page() {
		Assert.assertTrue(driver.getTitle().contains("home"));
	}


}
