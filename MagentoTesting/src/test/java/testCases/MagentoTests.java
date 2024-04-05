package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoTests {

	private ChromeDriver driverChrome;
	private HomePage homePage;
	private ProductDetailsPage productDetailsPage;
	private ShippingPage shippingPage;
	private PaymentPage paymentPage;
	private SuccessPage successPage;
	private LoginPage loginPage;
	

	@BeforeMethod
	public void setUp() {
		driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://magento.softwaretestingboard.com/");
		
		homePage = new HomePage(driverChrome);
		productDetailsPage = new ProductDetailsPage(driverChrome);
		shippingPage = new ShippingPage(driverChrome);
		paymentPage = new PaymentPage(driverChrome);
		successPage = new SuccessPage(driverChrome);
	}

	@Test
	public void testOrderPlacementWithAnonymiusUserRefactored() throws InterruptedException {

		// test code for placing an order for a non-logged-in user

		// selecting the product
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();

		// completing the address details
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterPostalCode("204487");
		shippingPage.enterCountry();
		shippingPage.enterTelNumber("2044456789");

		// placing the order
		paymentPage.placeOrder();

		// check order confirmation 
		Assert.assertTrue(successPage.isConfirmationOrderDisplayed());

	}

	@Test
	public void testOrderPlacementWithAnonymiusUserWithoutTelNr() throws InterruptedException {
		
		// test code for placing an order for a non-logged-in user without tel. number

		HomePage homePage = new HomePage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);

		// selecting the product
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();

		// completing the address details
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterPostalCode("204487");
		shippingPage.enterCountry();

		// placing the order
		paymentPage.placeOrder();

		// check error message is shown
		successPage.confirmOrder2();

	}

	@Test
	public void testOrderPlacementWithAnonymiusUserWithoutPostalCode() throws InterruptedException {

		// test code for placing an order for a non-logged-in user without postal code

		HomePage homePage = new HomePage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);

		// selecting the product
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();

		// completing the address details
		shippingPage.enterEmail("test@gmail.com");
		shippingPage.enterFirstName("Stela");
		shippingPage.enterLastName("Kodac");
		shippingPage.enterAddress("Addresa printesa 76");
		shippingPage.enterCity("Marte");
		shippingPage.enterCountry();
		shippingPage.enterTelNumber("2044456789");

		// placing the order
		paymentPage.placeOrder();

		// check error message is shown
		successPage.confirmOrder2();

	}

	@Test
	public void testOrderPlacementWithLoggedUser() throws InterruptedException {

		// test code for placing an order for a logged user

		HomePage homePage = new HomePage(driverChrome);
		LoginPage loginPage = new LoginPage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);

		// creating an user 
		homePage.loginUser();
		loginPage.loginFirstName("ANA" + System.currentTimeMillis());
		loginPage.loginLastName("BUSUIOC" + System.currentTimeMillis());
		loginPage.loginEmail("busuioc.ana" + System.currentTimeMillis());
		loginPage.loginPass("auto_ANA9");
		loginPage.loginConfirmPass("auto_ANA9");
		loginPage.loginCreate();
		homePage.reload();

		// selecting the product
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();

		// completing the address details
		shippingPage.enterAddress2("Addresa printesa 76");
		shippingPage.enterCity2("Alebama");
		shippingPage.enterCountry2();
		shippingPage.enterPostalCode2("204487");
		shippingPage.enterTelNumber2("2044456789");
		shippingPage.enterShipping();

		// placing the order
		paymentPage.placeOrder();

		// check order confirmation
		successPage.isConfirmationOrderDisplayed();

	}

	@Test
	public void testOrderPlacementWithLoggedUserWithoutShippingMethod() throws InterruptedException {

		// test code for placing an order for a logged user without shipping method

		HomePage homePage = new HomePage(driverChrome);
		LoginPage loginPage = new LoginPage(driverChrome);
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driverChrome);
		ShippingPage shippingPage = new ShippingPage(driverChrome);
		PaymentPage paymentPage = new PaymentPage(driverChrome);
		SuccessPage successPage = new SuccessPage(driverChrome);

		// creating an user 
		homePage.loginUser();
		loginPage.loginFirstName("ANA" + System.currentTimeMillis());
		loginPage.loginLastName("BUSUIOC" + System.currentTimeMillis());
		loginPage.loginEmail("busuioc.ana" + System.currentTimeMillis());
		loginPage.loginPass("auto_ANA9");
		loginPage.loginConfirmPass("auto_ANA9");
		loginPage.loginCreate();
		homePage.reload();

		// selecting the product
		homePage.tapOnFirstProduct();
		productDetailsPage.selectSizeAndColor();
		productDetailsPage.addToCart();
		homePage.checkout();

		// completing the address details
		shippingPage.enterAddress2("Addresa printesa 76");
		shippingPage.enterCity2("Alebama");
		shippingPage.enterCountry2();
		shippingPage.enterPostalCode2("204487");
		shippingPage.enterTelNumber2("2044456789");

		// placing the order
		paymentPage.placeOrder();

		// check error message is shown
		successPage.confirmOrderWithoutShipping();
	}

}
