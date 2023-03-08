package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class EnterProductData_PageObjects extends BaseClass{
	
	@FindBy(id="startdate")
	WebElement hdp_startDate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insuranceSum;
	
	@FindBy(id="meritrating")
	WebElement dd_meritRating;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageInsurance;
	
	@FindBy(xpath="//input[@name='Optional Products[]']/parent::label")
	List<WebElement> cb_optionalProducts;
	
	@FindBy(id="courtesycar")
	WebElement dd_courtesyCar;
	
	@FindBy(id="preventerinsurancedata")
	WebElement btn_prev;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn_next;
	
	public EnterProductData_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterProductData(HashMap<String,String> testData) {
		hdp_startDate.sendKeys(testData.get("Product_Start Date"));
		cm.selectOption(dd_insuranceSum, testData.get("Product_Insurance Sum [$]"));
		cm.selectOption(dd_meritRating, testData.get("Product_Merit Rating"));
		cm.selectOption(dd_damageInsurance, testData.get("Product_Damage Insurance"));
		cm.selectCheckBoxes(cb_optionalProducts, testData.get("Product_Optional Products"));
		cm.selectOption(dd_courtesyCar, testData.get("Product_Courtesy Car"));
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}
	 

}
