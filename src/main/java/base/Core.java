package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Core {

	 static WebDriver driver = new ChromeDriver(); 

	@BeforeClass
	public void statrup() {

		System.setProperty("webdriver.chrome.driver", "/AmazonEgiftAutomation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void closeup() {

		driver.quit();

	}

}
