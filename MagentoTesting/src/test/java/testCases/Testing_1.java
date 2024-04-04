package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing_1 {
	
	@Test
	public void exemplu() {
		int result = 5 + 15;
		
		Assert.assertEquals(result, 10);
		
		boolean isOrderPageDispalyed = true;
		
		Assert.assertTrue(isOrderPageDispalyed);
	}

	@Test
	public static void testOrderPlacementWithAnonymiusUser() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat (TestCase_2)
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//In jos-> selectarea produsului
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(4000);		
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(5000);
		
	//In jos-> completarea datelor adresei
		driverChrome.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("test@gmail.com");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Stela");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Kodac");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Addresa printesa 76");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Marte");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("204487");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ENTER);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("2044456789");
		Thread.sleep(3000);
		
	//In jos-> plasarea order-ului
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();		
	}
	
	
	@Test
	public static void testOrderPlacementWithAnonymiusUserWithoutTelNr() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat care nu introduce nr de telefon (TestCase_22)
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//In jos-> selectarea produsului
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(6000);
		
	//In jos-> completarea datelor adresei	
		driverChrome.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("pisica.cute@gmail.com");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Stev");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Cozonac");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Strada iepuras, 02");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Pluto");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("204487");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ARROW_DOWN);	
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	
	//In jos-> click pe "Next" si putem vedea mesajul de error 
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
	}
	
	

	@Test
	public static void testOrderPlacementWithAnonymiusUserWithoutPostalCode() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat care nu introduce codul postal
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();		
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//In jos-> selectarea produsului
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(6000);
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(4000);

	//In jos-> completarea datelor adresei	
		driverChrome.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("briose.dulci@gmail.com");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Kim");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Briosa");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Test address, 02");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Jupiter");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("2044456789");	
		
	//In jos-> click pe "Next" si putem vedea mesajul de error 
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
		

	}
	
	@Test
	public static void testOrderPlacementWithLoggedUser() throws InterruptedException {
    	
	//Codul de plasare a unei comenzi pentru un utilizator logat
		
    	ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//In jos-> crearea unui user dinamic
		driverChrome.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		driverChrome.findElement(By.cssSelector("#firstname")).sendKeys("ANA"+System.currentTimeMillis());
		driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("BUSUIOC"+System.currentTimeMillis());
		driverChrome.findElement(By.xpath("//input[@id='email_address']")).sendKeys("busuioc.ana"+System.currentTimeMillis()+"@gmail.com");
		driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//button[@title='Create an Account']")).click();
		
	//In jos-> selectarea produsului
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");	
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("//a[@class='action showcart']")).click();
		
	//In jos-> completarea datelor adresei
		driverChrome.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")).click();
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).click();	
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Magic street 1");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).sendKeys("Alebama");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ENTER);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")).sendKeys("20444");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")).sendKeys("2044456789");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();		
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).isSelected());
	
	//In jos-> plasarea order-ului
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		driverChrome.findElement(By.cssSelector("#checkout-payment-method-load > div > div > div.payment-method._active > div.payment-method-content > div.actions-toolbar > div > button > span")).click();
    }
	
	
	
	@Test
    public static void testOrderPlacementWithLoggedUserWithoutShippingMethod() throws InterruptedException {
		
		//Codul de plasare a unei comenzi pentru un utilizator logat fara alegerea unei metode de livrare
    	
    	ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//In jos-> crearea unui user dinamic
		driverChrome.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		driverChrome.findElement(By.cssSelector("#firstname")).sendKeys("ANA"+System.currentTimeMillis());
		driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("BUSUIOC"+System.currentTimeMillis());
		driverChrome.findElement(By.xpath("//input[@id='email_address']")).sendKeys("busuioc.ana"+System.currentTimeMillis()+"@gmail.com");
		driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//button[@title='Create an Account']")).click();
		
	//In jos-> selectarea produsului
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");	
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("//a[@class='action showcart']")).click();
		
	//In jos-> completarea datelor adresei
		driverChrome.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")).click();
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).click();	
		driverChrome.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Magic street 1");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).sendKeys("Alebama");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ARROW_DOWN);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys(Keys.ENTER);
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")).sendKeys("20444");
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")).sendKeys("2044456789");
		
	//In jos-> click pe "Next" si putem vedea mesajul de error 
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();	
    }

}