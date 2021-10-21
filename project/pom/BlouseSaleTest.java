package com.project.pom;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class BlouseSaleTest {
	
	private WebDriver driver;
	SelectedBlousePage selectedBlousePage;
	BlouseAddPage blouseAddPage;
	UserSignInPage userSignInPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;

	@Before

	public void setUp() throws Exception {
		selectedBlousePage = new SelectedBlousePage(driver);
		driver = selectedBlousePage.chromeDriverC();
		selectedBlousePage.visit("http://automationpractice.com/index.php");
		blouseAddPage = new BlouseAddPage(driver);
		userSignInPage = new UserSignInPage(driver);
		shippingPage = new ShippingPage(driver);
		paymentPage = new PaymentPage(driver);

	}
	
	
	@After
	public void tearDown() throws Exception {
		
	}


	@Test
	public void test() throws InterruptedException  {
		selectedBlousePage.test();
		Thread.sleep(2000);
		blouseAddPage.test();
		Thread.sleep(2000);
		userSignInPage.test();
		Thread.sleep(2000);
		shippingPage.test();
		Thread.sleep(2000);
		paymentPage.test();
		Thread.sleep(2000);
		assertEquals("Your order on My Store is complete.",paymentPage.Message());
		
	}

}
