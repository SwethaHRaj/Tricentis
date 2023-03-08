package testBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterInsurantData_PageObjects;
import pageObjects.EnterProductData_PageObjects;
import pageObjects.EnterVehicleData_PageObjects;
import pageObjects.Home_PageObjects;
import pageObjects.SelectPriceOption_PageObjects;
import pageObjects.SendQuote_PageObjects;
import reusableComponents.PropertiesOpertaion;

public class BaseClass extends ObjectsRepo{
	
	public void launchBrowserAndNavigate() throws Exception {
		
		String browser=PropertiesOpertaion.getPropertyValueByKey("browser");
		String url=PropertiesOpertaion.getPropertyValueByKey("url");                              
		
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void launch() throws Exception {
		launchBrowserAndNavigate();
		homePage=new Home_PageObjects();
		vehicleData=new EnterVehicleData_PageObjects();
		insurantData=new EnterInsurantData_PageObjects();
		productData=new EnterProductData_PageObjects();
		priceOption=new SelectPriceOption_PageObjects();
		quote=new SendQuote_PageObjects();
	}
	
	@AfterMethod
	public void cleanUp() throws InterruptedException {
		Thread.sleep(15000);
		driver.quit();
	}

}
