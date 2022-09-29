package com.stepdefs;


import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	WebDriver driver= null;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		 driver =new ChromeDriver();
	}
	@After
	public void teardown() {
		driver.close();
	}
	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
		driver.get("file:///C:/seleniumsoftware/Offline%20Website/Offline%20Website/index.html");
	 	
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String urname, String pass) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(urname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user verify \"([^\"]*)\"$")
	public void user_verify(String title) throws Throwable {
	  Assert.assertEquals("JavaByKiran | "+title,driver.getTitle() );
	}
	@Then("^user should be see JBK logo$")
	public void user_should_be_see_JBK_logo() throws Throwable {
     WebElement logo=driver.findElement(By.tagName("img"));
     Assert.assertTrue(logo.isDisplayed());
	}
}
