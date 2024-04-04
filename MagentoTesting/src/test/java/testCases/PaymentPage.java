package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentPage {
	
	private ChromeDriver driverChrome;
	
	public PaymentPage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}
	
	public void placeOrder() throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		
	}

}
