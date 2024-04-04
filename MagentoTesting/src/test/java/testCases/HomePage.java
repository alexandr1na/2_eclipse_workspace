package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private ChromeDriver driverChrome;
	
	public HomePage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}
	
	public void tapOnFirstProduct() {
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
	}
	
	public void checkout() throws InterruptedException {
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(5000);
	}

}
