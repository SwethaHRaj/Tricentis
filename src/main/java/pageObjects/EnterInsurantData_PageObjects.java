package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class EnterInsurantData_PageObjects extends BaseClass{
	
	@FindBy(id="enterinsurantdata")
	WebElement link_EnterInsurantData;
	
	@FindBy(id="firstname")
	WebElement tb_firstName;
	
	@FindBy(id="lastname")
	WebElement tb_lastName;
	
	@FindBy(id="birthdate")
	WebElement hdp_dateOfBirth;
	
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> rb_gender;
	
	@FindBy(id="streetaddress")
	WebElement tb_streetAddress;
	
	@FindBy(id="country")
	WebElement dd_country;
	
	@FindBy(id="zipcode")
	WebElement tb_zipCode;
	
	@FindBy(id="city")
	WebElement tb_city;
	
	@FindBy(id="occupation")
	WebElement dd_occupation;
	
	@FindBy(xpath="//input[@name='Hobbies']/parent::label")   
	List<WebElement> cb_hobbies;
	
	@FindBy(id="website")
	WebElement tb_website;
	
	@FindBy(xpath="//button[@id='open']")  
	WebElement fup_picture;
	
	@FindBy(id="preventervehicledata")
	WebElement btn_prev;
	
	@FindBy(id="nextenterproductdata")
	WebElement btn_next;
	
	public EnterInsurantData_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	 
	public void enterInsurantData(HashMap<String,String> testData) throws Exception {
		tb_firstName.sendKeys(testData.get("Insurant_First Name"));
		tb_lastName.sendKeys(testData.get("Insurant_Last Name"));
		hdp_dateOfBirth.sendKeys(testData.get("Insurant_Date of Birth"));		
		selectGender(testData.get("Insurant_Gender"));
		tb_streetAddress.sendKeys(testData.get("Insurant_Street Address"));
		cm.selectOption(dd_country, testData.get("Insurant_Country"));
		tb_zipCode.sendKeys(testData.get("Insurant_Zip Code"));
		tb_city.sendKeys(testData.get("Insurant_City"));
		cm.selectOption(dd_occupation, testData.get("Insurant_Occupation"));
		cm.selectCheckBoxes(cb_hobbies,testData.get("Insurant_Hobbies"));
		tb_website.sendKeys(testData.get("Insurant_Website"));
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}
	
	public void clickOnEnterInsurantData() {
		link_EnterInsurantData.click();
	}
	
	public void selectGender(String gender) throws Exception {
		for(WebElement we:rb_gender) {
			if(we.getText().equalsIgnoreCase(gender)) {
				we.click();
				break;
			} 
			else
				throw new Exception("Entered Gender not correct");
		}
	}
	
	/*public void uploadPicture(String filePath) {	//continue
		
		fup_picture.sendKeys(filePath);
	}*/

}                  













                                 