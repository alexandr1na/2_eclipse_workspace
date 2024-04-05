package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	private ChromeDriver driverChrome;
	
	public LoginPage(ChromeDriver chromeDriver) {
		this.driverChrome = chromeDriver;
	}

	public void loginFirstName(String string) {
		driverChrome.findElement(By.cssSelector("#firstname")).sendKeys("ANA"+System.currentTimeMillis());
		
	}

	public void loginLastName(String string) {
		driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("BUSUIOC"+System.currentTimeMillis());
	}

	public void loginEmail(String string) {
		driverChrome.findElement(By.xpath("//input[@id='email_address']")).sendKeys("busuioc.ana"+System.currentTimeMillis()+"@gmail.com");
		
	}

	public void loginPass(String string) {
		driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
		
	}

	public void loginConfirmPass(String string) {
		driverChrome.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("auto_ANA9");
	}

	public void loginCreate() {
		driverChrome.findElement(By.xpath("//button[@title='Create an Account']")).click();
	}
	
	
}
