package com.entrenamiento.qa;


import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleTest {

			
		private WebDriver driver;
		
		@Before
		public void setUp()	{
			
			WebDriverManager.getInstance(CHROME).setup();
			driver	= new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://www.google.com/"); 
		}
		
		@Test
		public void testGooglepage() {
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.clear(); 
			
			searchbox.sendKeys("Perficient"); 
			searchbox.submit(); 
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			assertEquals("Perficient - Buscar con Google",driver.getTitle());
		}
		
		@After
		public void tearDown() { 
			driver.quit();
			
		}

	
}
