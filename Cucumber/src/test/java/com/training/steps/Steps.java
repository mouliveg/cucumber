package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest{
	
	WebDriver driver;
	
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	@Before
	public void setup() throws IOException {
		
		launchapplication();
		
	}
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
	    page=pageFactory.initialize(pageName);
	}
	
	@When("User enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String Value) {
			page.enterIntoTextBox(logicalName,Value);
	}
	
	@When("User Clicks on the CheckBox {string}")
	public void user_clicks_on_the_check_box(String logicalName) {
	   page.clickCheckbox(logicalName);
	   
	}
	
	
	@Then("User Clicks on Button {string}")
	public void user_clicks_on_button(String logicalName) {
		page.clickButton(logicalName);
	}

}
