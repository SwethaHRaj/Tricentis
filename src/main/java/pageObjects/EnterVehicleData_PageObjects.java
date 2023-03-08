package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class EnterVehicleData_PageObjects extends BaseClass{
	
	@FindBy(id="entervehicledata")
	WebElement link_EnterVehicleData;
	
	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="engineperformance")
	WebElement tb_enginePerformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement hdp_dateOfManufacture;
	
	@FindBy(id="numberofseats")
	WebElement dd_numberOfSeats;
	
	@FindBy(id="fuel")
	WebElement dd_fuelType;
	
	@FindBy(id="listprice")
	WebElement tb_listPrice;
	
	@FindBy(id="licenseplatenumber")
	WebElement tb_licensePlateNumber;
	
	@FindBy(id="annualmileage")
	WebElement tb_annualMileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_next;
	
	@FindBy(xpath="(//span[@class='error'])[1]")
	WebElement error_enginePerformance;
	
	//Constructor
	public EnterVehicleData_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterVehicleData(HashMap<String,String> testData) {
		cm.selectOption(dd_make, testData.get("Vehicle_Make"));
		tb_enginePerformance.sendKeys(testData.get("Vehicle_Engine Performance [kW]"));
		hdp_dateOfManufacture.sendKeys(testData.get("Vehicle_Date of Manufacture"));
		cm.selectOption(dd_numberOfSeats, testData.get("Vehicle_Number of Seats"));
		cm.selectOption(dd_fuelType, testData.get("Vehicle_Fuel Type"));
		tb_listPrice.sendKeys(testData.get("Vehicle_List Price [$]"));
		tb_licensePlateNumber.sendKeys(testData.get("Vehicle_License Plate Number"));
		tb_annualMileage.sendKeys(testData.get("Vehicle_Annual Mileage [mi]"));
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}
	
	public void clickOnEnterVehicleData() {
		link_EnterVehicleData.click();
	}
	
	public String getErrorMessageOnEnginePerformance() {
		return error_enginePerformance.getText();
	}
	
	public List<String> getOptionsOfMakeDropDown() {
		return cm.getListOfDropDown(dd_make);
	}
	
	
}










