package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsPage {

	private ChromeDriver driverChrome;

	public ProductDetailsPage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}

	public void selectSizeAndColor() {
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
	}

	public void addToCart() throws InterruptedException {
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(4000);
	}
}
