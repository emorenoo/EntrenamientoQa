package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage{
	
	By PayByBank= By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	By ConfirmOrder= By.xpath("//*[@id=\"cart_navigation\"]/button");
	By Confirmation= By.xpath("//*[@id=\"center_column\"]/div/p/strong");


	private WebDriver driver;
	
	public PaymentPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public String getText(By locator) {  
		return driver.findElement(locator).getText();
	}
	public void test() throws InterruptedException {
		click(PayByBank);
		Thread.sleep(2000);
		click(ConfirmOrder);
		Thread.sleep(2000);	

	}
	
	public String Message() { 
		String Message = findElement(Confirmation).getText();
		return Message;
		
	}

}

