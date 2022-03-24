package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;



public class LoginErrorMessagepage1 extends BasePage {
	

	static WebDriver  driver;
	public LoginErrorMessagepage1() {
		super(driver = BaseTest.getDriver());
	
		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("Login", By.name("Login"));
	}
}
