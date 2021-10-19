package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserSignInPage {
	
	By Email= By.id("email");
	By Password= By.id("passwd");
	By SignIn= By.id("SubmitLogin");

	private WebDriver driver;
	
	public UserSignInPage(WebDriver driver) {
		this.driver= driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public String getText(By locator) {  
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void test() throws InterruptedException {
		type("edmoreno@fuluj.com",Email);
		type("edmoreno",Password);
		click(SignIn);
		Thread.sleep(2000);	

		
	}
	

}

