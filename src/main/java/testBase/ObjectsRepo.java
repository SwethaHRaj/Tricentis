package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.EnterInsurantData_PageObjects;
import pageObjects.EnterProductData_PageObjects;
import pageObjects.EnterVehicleData_PageObjects;
import pageObjects.Home_PageObjects;
import pageObjects.SelectPriceOption_PageObjects;
import pageObjects.SendQuote_PageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	public static WebDriver driver;
	public static Home_PageObjects homePage;
	public static EnterVehicleData_PageObjects vehicleData;
	public static EnterInsurantData_PageObjects insurantData;
	public static EnterProductData_PageObjects productData;
	public static ExtentReports report;
	public static ExtentTest test;
	public static CommonMethods cm=new CommonMethods();
	public static SelectPriceOption_PageObjects priceOption;
	public static SendQuote_PageObjects quote;
	

}
