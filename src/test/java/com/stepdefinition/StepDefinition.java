package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	@Given("User launch the facebook application")
	public void user_launch_the_facebook_application() {
	   
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
	   
		driver.findElement(By.id("email")).sendKeys("greens@123");
		driver.findElement(By.id("pass")).sendKeys("Hellogreens");
		
	}

	@When("User clicks the login Button")
	public void user_clicks_the_login_Button() {
	    
		driver.findElement(By.name("login")).click();
	}

	@Then("User Verify the error message is displayed or not")
	public void user_Verify_the_error_message_is_displayed_or_not() {
	  
		WebElement err = driver.findElement(By.xpath("//div[contains(text(),'email')]"));
		String text = err.getText();
		//System.out.println(text);
		boolean b = text.contains("email");
		System.out.println(b);
	}
	@When("User maximize the browser")
	public void user_maximize_the_browser() {
	    
		driver.manage().window().maximize();
	}

	@When("User clicks the Create new account Button")
	public void user_clicks_the_Create_new_account_Button() {
	    
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	}

	@Then("User Verfity the create new account text displayed or not")
	public void user_Verfity_the_create_new_account_text_displayed_or_not() {
	    
		WebElement txt = driver.findElement(By.xpath("//div[contains(text(),'Create')]"));
		String text = txt.getText();
		boolean contains = text.contains("Create");
		System.out.println(contains);
	}
	
	@When("User enters the invalid {string} and invalid {string}")
	public void user_enters_the_invalid_and_invalid(String username, String password) {
	    
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
