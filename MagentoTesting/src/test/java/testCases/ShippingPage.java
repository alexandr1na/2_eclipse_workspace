package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShippingPage {
	
	private ChromeDriver driverChrome;
	
	public ShippingPage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}
	
	public void enterEmail(String email) throws InterruptedException {
		driverChrome.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys(email);
		
	}

	public void enterFirstName(String FName) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Stela");
	}
	
	public void enterLastName(String LName) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Kodac");
		
	}

	public void enterAddress(String address) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Addresa printesa 76");
		
	}

	public void enterCity(String city) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Marte");
		
	}

	public void enterPostalCode(String PCode) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("204487");
		
	}

	public void enterCountry() throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public void enterTelNumber(String TelNr) throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("2044456789");
		Thread.sleep(3000);
	}

	

}
