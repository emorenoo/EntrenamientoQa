package com.project.pom;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedBlousePage {

	By Women= By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By Tops= By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
	By Blouses= By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img");
	By Blouse= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	
	private WebDriver driver;
	
	public SelectedBlousePage (WebDriver driver) {
		this.driver= driver;
	}



	public WebDriver chromeDriverC() {
		WebDriverManager.getInstance(CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		return driver;
	}
	
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void test() throws InterruptedException {
		click(Women);
		Thread.sleep(2000);
		click(Tops);
		Thread.sleep(2000);
		click(Blouses);
		Thread.sleep(2000);
		click(Blouse);
		Thread.sleep(2000);

	}
}
