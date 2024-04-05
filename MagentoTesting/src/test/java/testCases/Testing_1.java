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
	public static void testOrderPlacementWithAnonymiusUserRefactored() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat (TestCase_2)
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homePage = new HomePage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);
		
	//In jos-> selectarea produsului
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();
		
	//In jos-> completarea datelor adresei
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterPostalCode("204487");
		shippingPage.enterCountry();
		shippingPage.enterTelNumber("2044456789");
		
	//In jos-> plasarea order-ului
		paymentPage.placeOrder();
		
	// verifica order confirmation se afiseaza: "Thank you for your order!"
		successPage.confirmOrder();
		
	}
	
	
	
	
	@Test
	public static void testOrderPlacementWithAnonymiusUserWithoutTelNr() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat care nu introduce nr de telefon (TestCase_22)
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		HomePage homePage = new HomePage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);
		
	//In jos-> selectarea produsului
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();
		
	//In jos-> completarea datelor adresei
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterPostalCode("204487");
		shippingPage.enterCountry();
		
	//In jos-> click pe "Next" si putem vedea mesajul de error
		paymentPage.placeOrder();
		
	//verificate error message is shown
		successPage.confirmOrder2();
		
	}
	
	
	

	@Test
	public static void testOrderPlacementWithAnonymiusUserWithoutPostalCode() throws InterruptedException {
		
	//Codul de plasare a unei comenzi pentru un utilizator ne-logat care nu introduce codul postal
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com/");
		driverChrome.manage().window().maximize();		
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homePage = new HomePage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);
		
	//In jos-> selectarea produsului
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();
		
	//In jos-> completarea datelor adresei
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterCountry();
		shippingPage.enterTelNumber("2044456789");
		
	//In jos-> click pe "Next" si putem vedea mesajul de error
		paymentPage.placeOrder();
		
	//verificate error message is shown
		successPage.confirmOrder2();
		
	}
	
	@Test
	public static void testOrderPlacementWithLoggedUser() throws InterruptedException {
    	
	//Codul de plasare a unei comenzi pentru un utilizator logat
		
    	ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homePage = new HomePage(driverChrome);
		LoginPage loginPage = new LoginPage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);
		
		
	//In jos-> crearea unui user dinamic
		homePage.loginUser();
		loginPage.loginFirstName("ANA"+System.currentTimeMillis());
		loginPage.loginLastName("BUSUIOC"+System.currentTimeMillis());
		loginPage.loginEmail("busuioc.ana"+System.currentTimeMillis());
		loginPage.loginPass("auto_ANA9");
		loginPage.loginConfirmPass("auto_ANA9");
		loginPage.loginCreate();
		homePage.reload();
		//driverChrome.findElement(By.cssSelector("#firstname")).sendKeys("ANA"+System.currentTimeMillis());
		//driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("BUSUIOC"+System.currentTimeMillis());
		//driverChrome.findElement(By.xpath("//input[@id='email_address']")).sendKeys("busuioc.ana"+System.currentTimeMillis()+"@gmail.com");
		//driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
		//driverChrome.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("auto_ANA9");
		//driverChrome.findElement(By.xpath("//button[@title='Create an Account']")).click();
		
	
		//In jos-> selectarea produsului
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();
		
		
	//In jos-> completarea datelor adresei
		shippingPage.enterAddress2("Addresa printesa 76");
		shippingPage.enterCity2("Alebama");
		shippingPage.enterCountry2();
		shippingPage.enterPostalCode2("204487");
		shippingPage.enterTelNumber2("2044456789");
		shippingPage.enterShipping();
	
		
	////In jos-> plasarea order-ului
		paymentPage.placeOrder();
				
	//verificate confirmation page is displayed
		successPage.confirmOrder2();

	
		//driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		
		//driverChrome.findElement(By.cssSelector("#checkout-payment-method-load > div > div > div.payment-method._active > div.payment-method-content > div.actions-toolbar > div > button > span")).click();
    
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
   
		// verifica error message
	}

}
