package com.project.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BlouseAddPage {
		
	By AddToCar= By.xpath("//*[@id=\"add_to_cart\"]/button");
	By CheckOut1= By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By CheckOut2= By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	
	private WebDriver driver;
	
	public BlouseAddPage (WebDriver driver) {
		this.driver= driver;
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void test() throws InterruptedException {
		click(AddToCar);
		Thread.sleep(10000);
		click(CheckOut1);
		Thread.sleep(2000);
		click(CheckOut2);
		Thread.sleep(2000);
		

		
	}
	

}

