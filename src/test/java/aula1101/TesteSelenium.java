package aula1101;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
	
	WebDriver driver;
	
	@Test
	public void verificaTituloPaginaMaven() {
		
		String chromewebdriver = "drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromewebdriver);
		
		driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.10.0");
		
		String titulo = driver.getTitle();
		Assert.assertTrue(titulo.contains("Maven"));
		
	}
	
	@After
	public void fechaBrowser() {
		driver.quit();
	}
	
}
