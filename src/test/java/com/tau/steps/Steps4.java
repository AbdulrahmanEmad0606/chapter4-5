package com.tau.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps4{
		private WebDriver driver;
		@Before
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "Resources/chrome/chromedriver105.exe");
			driver = new ChromeDriver();
			driver.get("http://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();
		}
	
		@Given("I am in the login page of the Para Bank Application")
		public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
			System.out.println("hello");
		}
	
		@When("I enter valid {string} and {string}")
		public void i_enter_valid_credentials(String username, String password) {

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("username")).submit();
		}
	
		@Then("I should be taken to the Overview page")
		public void i_should_be_taken_to_the_Overview_page() throws Exception {
			driver.findElement(By.linkText("Log Out")).click();
		}
//		@After()
//		public void quitBrowser() {
//		    driver.quit();
//		}

}
