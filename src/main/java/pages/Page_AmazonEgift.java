package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.Core;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_AmazonEgift {

	private static WebDriver driver;

	public static void startUp() {

		WebDriverManager.chromedriver().setup(); // Manage the WebDriver automatically
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	public static void searchGoogle(String searchlink) {

		WebElement txtGsearch = driver.findElement(By.id("APjFqb"));
		txtGsearch.sendKeys(searchlink); // Search Amazon on Google search
	}

	public static void clickSearch() {

		WebElement btnSearch = driver.findElement(By.id("APjFqb"));
		btnSearch.submit();
		
	}

	public static void getLink(String weblink) throws InterruptedException {

		WebElement searchBox = driver.findElement(By.xpath("//span[contains(text(),'" + weblink + "')]"));
		searchBox.click();
		Thread.sleep(5000);

	}

	public static void clickDeliver() throws InterruptedException {

		WebElement btnDeliverto = driver.findElement(By.id("nav-global-location-popover-link"));

		if (btnDeliverto.isDisplayed()) {
			btnDeliverto.click();
		} else {
			Thread.sleep(5000);
			// Click on "Your Account" button
			WebElement btnYouraccount = driver.findElement(By.xpath("//div[@class='nav-bb-right']/a[text()='Your Account']"));
			btnYouraccount.click();
			Thread.sleep(5000);
			// Click on "Deliver to" button again after navigating
			btnDeliverto.click();
		}

		Thread.sleep(5000);

	}

	public static void selectCountry(String country) {

		WebElement btnDropdown = driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]"));
		btnDropdown.click();
		WebElement selectCountry = driver.findElement(By.xpath("//a[contains(text(),'" + country + "')]"));
		selectCountry.click();

	}

	public static void clickDone() {

		WebElement btnDone = driver.findElement(By.xpath("//button[@name='glowDoneButton']"));
		btnDone.click();

	}

	public static void verifyCountry(String dCountry) {

		WebElement changeCountry = driver.findElement(By.xpath("//span[contains(text(),'" + dCountry + "')]"));
		String btnText = changeCountry.getText();
		btnText.contains(dCountry); // verify correct country visible on the field

	}

	public static void searchAmazon(String searchtext) {

		WebElement txtAsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtAsearch.sendKeys(searchtext);
		
	}

	public static void clickAsearch() {

		WebElement btnAsearch = driver.findElement(By.id("nav-search-submit-button"));
		btnAsearch.submit();

	}

	public static void clickResult(String giftcard) throws InterruptedException {

		WebElement btnGiftcard = driver.findElement(By.xpath("//span[contains(text(),'" + giftcard + "')]"));
		btnGiftcard.click();
		Thread.sleep(5000);

	}

	public static void clickGiftcard() throws InterruptedException {

		WebElement btnGiftcardclick = driver
				.findElement(By.xpath("//img[@class='s-image'][@data-image-index='1']")); 
		btnGiftcardclick.click();
		Thread.sleep(5000);

	}

	public static void verifyGiftcard(String design) throws InterruptedException {

		WebElement cardDesign = driver.findElement(By.xpath("//img[@alt='" + design + "']"));
		cardDesign.click();
		String txtDesign = cardDesign.getAttribute("alt");

		WebElement verifyDesign = driver.findElement(By.xpath("//span[@id='gc-design-title']"));
		String txtDisplayeddesign = verifyDesign.getText();

		Assert.assertEquals(txtDisplayeddesign, txtDesign); //verify both the names are same
		Thread.sleep(5000);

	}

	public static void selectAmount(String amount) {

		WebElement btnAmount = driver.findElement(By.xpath("//button[contains(text(),'" + amount + "')]"));
		((ChromeDriver) driver).executeScript("arguments[0].scrollIntoView();", btnAmount); // Scroll to find element
		btnAmount.click();

	}

	public static void verifyAmount(String vamount) {

		WebElement txtAmount = driver.findElement(By.xpath("//span[contains(text(),'"+ vamount +"')]"));
		((ChromeDriver) driver).executeScript("arguments[0].scrollIntoView();", txtAmount); // Scroll to find element
		txtAmount.isDisplayed();

	}
	
	public static void closeUp() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();

	}

}
