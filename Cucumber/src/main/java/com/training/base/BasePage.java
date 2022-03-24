package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	


	
public void addObject(String logicalName , By by) {
	ObjRep.put(logicalName, by);
}




public void enterIntoTextBox(String logicalName, String value) {
	
	WebElement element = getWebElement(logicalName);
	enterIntoTextBox(element,value);
}

public void clickCheckbox(String logicalName) {
	WebElement element = getWebElement(logicalName);
		clickCheckbox(element);
	
}


public void clickButton(String logicalName) {
	WebElement element = getWebElement(logicalName);
	clickButton(element);
}

/*******************************************************************************/

private void clickButton(WebElement element) {
	waitForElement(element);
	element.click();
	
}

private void clickCheckbox(WebElement element) {
	waitForElement(element);
	element.click();
	
}


private void enterIntoTextBox(WebElement element, String value) {
	waitForElement(element);
	element.sendKeys(value);
}


private void waitForElement(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver , 20);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}


private WebElement getWebElement(String logicalName) {
	WebElement element = null;
	By by = null;
	by = ObjRep.get(logicalName);
	element = driver.findElement(by);
	return element;
}












}
