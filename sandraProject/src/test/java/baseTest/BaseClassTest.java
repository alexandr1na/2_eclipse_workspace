package baseTest;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr1;
	public static FileReader fr2;
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		
		if(driver==null) {
			FileReader fr1 = new FileReader("C:\\2_eclipse-workspace\\sandraProject\\src\\test\\resources\\configFiles\\config.properties");
			prop.load(fr1);
			
			FileReader fr2 = new FileReader("C:\\2_eclipse-workspace\\sandraProject\\src\\test\\resources\\configFiles\\locators.properties");
			loc.load(fr2);
			
		} if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		} else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		}
		
	}
	
	@AfterMethod
	public void browserClose() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();
		
	}
}