package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.Core;

public class Page_AmazonEgift {

	static WebDriver driver;

	public static void search_google(String searchlink) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Program Files (x86)\\Eclipse\\eclipse-workspace\\AmazonEgiftAutomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.id("APjFqb")).sendKeys(searchlink);
	}

	public static void click_search() {

		driver.findElement(By.id("APjFqb")).submit();
	}

	public static void get_link(String weblink) throws InterruptedException {
		WebElement searchBox = driver.findElement(By.xpath("//span[contains(text(),'" + weblink + "')]"));
		searchBox.click();
		Thread.sleep(2000);
	
	}

	public static void click_deliver() throws InterruptedException {

		WebElement button_deliverto = driver.findElement(By.id("nav-global-location-popover-link"));

		if (button_deliverto.isDisplayed()) {
			button_deliverto.click();
		} else {
			// Click on "Your Account" button
			WebElement button_yourAccount = driver.findElement(By.xpath("//a[contains(text(),'Your Account')]"));
			button_yourAccount.click();

			// Click on "Deliver to" button again after navigating
			button_deliverto.click();
		}
		
		Thread.sleep(5000);

	}

	public static void select_country(String country) {
		
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		WebElement select_country = driver.findElement(By.xpath("//a[contains(text(),'"+ country +"')]"));
		select_country.click();	
		
	}
	
	public static void click_done () {
		
		driver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
		
	}
	
	public static void verify_country (String dCountry) {
		
		// Wait for the deliver to button to update with the selected country
        WebElement change_country = driver.findElement(By.xpath("//span[contains(text(),'"+ dCountry +"')]"));
        //change_country.isDisplayed();
        String button_text = change_country.getText();
        button_text.contains(dCountry);
        
	}
	
	public static void search_amazon(String searchtext) {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchtext);
		
	}
	
	public static void click_Asearch() {
		
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
	}
	
	public static void click_result(String giftcard) throws InterruptedException {
		
		WebElement click_item = driver.findElement(By.xpath("//span[contains(text(),'" + giftcard + "')]"));
		click_item.click();
		Thread.sleep(5000);
		
	}
	
	public static void click_giftcard () throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/span/a/div/img")).click();
		Thread.sleep(5000);
		
	}
	
	public static void verify_giftcard (String design) throws InterruptedException {
		
		WebElement card_design = driver.findElement(By.xpath("//img[@alt='"+ design +"']"));
		card_design.click();
		String design_text = card_design.getText();
		
		WebElement verify_design = driver.findElement(By.xpath("//span[@id='gc-design-title']"));
		String dispalyed_designtext = verify_design.getText();
		
		Assert.assertEquals(dispalyed_designtext, design_text);
		Thread.sleep(5000);
        //button_text.contains(design);
		
	}
	
	public static void select_amount(String amount) {
		
		WebElement click_amount = driver.findElement(By.xpath("//button[contains(text(),'"+ amount +"')]"));
		((ChromeDriver) driver).executeScript("arguments[0].scrollIntoView();", click_amount);
		click_amount.click();
		
	}
	
	public static void verify_amount() {
		
		WebElement change_country = driver.findElement(By.xpath("//span[contains(text(),'$75.00')]"));
        change_country.isDisplayed();
		
	}
	
	

}
