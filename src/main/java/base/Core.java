package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Core {

	WebDriver driver; 

	@BeforeClass
	public void statrup() {

		WebDriverManager.chromedriver().setup(); // Manage the WebDriver automatically
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void closeup() {

		driver.quit();

	}

}
