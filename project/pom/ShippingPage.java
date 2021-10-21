package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage{
	
	By CheckOut3= By.name("processAddress");
	By CheckBox= By.id("cgv");
	By CheckOut4= By.name("processCarrier");

	private WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void test() throws InterruptedException {
		click(CheckOut3);
		Thread.sleep(2000);
		click(CheckBox);
		click(CheckOut4);
		Thread.sleep(2000);
		
	}
	

}
