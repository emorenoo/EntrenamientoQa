package com.entrenamiento.qa;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlouseSale {
	
	private WebDriver driver;
	By Women= By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By Tops= By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
	By Blouses= By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img");
	By Blouse= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	By AddToCar= By.xpath("//*[@id=\"add_to_cart\"]/button");
	By CheckOut1= By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By CheckOut2= By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By Email= By.id("email");
	By Password= By.id("passwd");
	By SignIn= By.id("SubmitLogin");
	By CheckOut3= By.name("processAddress");
	By CheckBox= By.id("cgv");
	By CheckOut4= By.name("processCarrier");
	By PayByBank= By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	By ConfirmOrder= By.xpath("//*[@id=\"cart_navigation\"]/button");
	By Confirmation= By.xpath("//*[@id=\"center_column\"]/div/p/strong");
	

	@Before
	public void setUp()	{
		
		WebDriverManager.getInstance(CHROME).setup();
		driver	= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(Women).click();
		Thread.sleep(2000);
		driver.findElement(Tops).click();
		Thread.sleep(2000);
		driver.findElement(Blouses).click();
		Thread.sleep(2000);
		driver.findElement(Blouse).click();
		Thread.sleep(2000);
		driver.findElement(AddToCar).click();
		Thread.sleep(2000);
		driver.findElement(CheckOut1).click();
		Thread.sleep(2000);
		driver.findElement(CheckOut2).click();
		Thread.sleep(2000);
		driver.findElement(Email).sendKeys("edmoreno@fuluj.com");
		driver.findElement(Password).sendKeys("edmoreno");
		driver.findElement(SignIn).click();
		Thread.sleep(2000);
		driver.findElement(CheckOut3).click();
		Thread.sleep(2000);
		driver.findElement(CheckBox).click();
		driver.findElement(CheckOut4).click();
		Thread.sleep(2000);
		driver.findElement(PayByBank).click();
		Thread.sleep(2000);
		driver.findElement(ConfirmOrder).click();
		Thread.sleep(2000);	
		String Message = driver.findElement(Confirmation).getText();
		assertTrue(Message.equals("Your order on My Store is complete."));
		
	}

}
