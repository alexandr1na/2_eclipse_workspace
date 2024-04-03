package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;
import utilities.ReadTestDataFile;

public class MainPageNG extends BaseClassTest {

	//@Test
	//public static void LoginTest() {
	//	driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user"); // locators - in properties vor merge
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");  // locators - in properties vor merge
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		@Test(dataProviderClass=ReadTestDataFile.class,dataProvider="credentialsData")
		public static void LoginTest(String username, String password) throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("username_field"))).sendKeys(username);
			System.out.println("Username has been entered");
			driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);
			System.out.println("Password has been entered");
			driver.findElement(By.xpath(loc.getProperty("next_button"))).click();//locators --properties
			Thread.sleep(1000);
			System.out.println("Button Login has been clicked");
		}
		
		@DataProvider(name="testdata")
		public Object[][] tData(){
			return new Object[][] {
				{"standard_user", "secret_sauce"},
				{"problem_user", "secret_sauce"}
			};
		}
}