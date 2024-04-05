package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SuccessPage {

	private ChromeDriver driverChrome;

	public SuccessPage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}

	public boolean isConfirmationOrderDisplayed() {
		boolean confirmationPageIsDisplayed = driverChrome
				.findElement(By.cssSelector("#maincontent > div.columns > div > div.checkout-success > div > div > a"))
				.isDisplayed();

		return confirmationPageIsDisplayed;
	}

	public boolean isConfirmationOrderDisplayedWithoutTelNr() {
		boolean confirmationPageIsDisplayed = driverChrome.findElement(By.xpath(
				"// /html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/div[2]/span"))
				.isDisplayed();

		return confirmationPageIsDisplayed;
	}

	public boolean isConfirmationOrderDisplayedWithoutPosCode() {
		boolean confirmationPageIsDisplayed = driverChrome.findElement(By.xpath(
				"// /html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/div[2]/span"))
				.isDisplayed();

		return confirmationPageIsDisplayed;
	}

	
	public boolean isConfirmationOrderDisplayedWithoutShipping() {
		boolean confirmationPageIsDisplayed = driverChrome
				.findElement(By.cssSelector("#co-shipping-method-form > div.message.notice > span")).isDisplayed();

		return confirmationPageIsDisplayed;
	}

}
