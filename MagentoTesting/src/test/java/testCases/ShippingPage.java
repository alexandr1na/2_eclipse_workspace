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
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys(FName);
	}
	
	public void enterLastName(String LName) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys(LName);
		
	}

	public void enterAddress(String address) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys(address);
		
	}

	public void enterCity(String city) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys(city);
		
	}

	public void enterPostalCode(String PCode) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys(PCode);
		
	}

	public void enterCountry() throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public void enterTelNumber(String TelNr) throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys(TelNr);
		Thread.sleep(3000);
	}

	public void enterAddressForLogged(String addressForLogged) {
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).click();	
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).sendKeys(addressForLogged);
	}

	public void enterCountryForLogged() {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ENTER);	
	}

	public void enterCityForLogged(String cityForLogged) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).sendKeys(cityForLogged);	
	}

	public void enterPostalCodeForLogged(String codeForLogged) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")).sendKeys(codeForLogged);	
	}

	public void enterTelNumberForLogged(String nrForLogged) {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")).sendKeys(nrForLogged);
	}

	public void enterShipping() {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();		
	}

	

}
