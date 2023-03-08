package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SelectPriceOption_PageObjects extends BaseClass {
	
	@FindBy(id="nextsendquote")
	WebElement btn_next;
	
	public SelectPriceOption_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	

	public void selectPriceOption(HashMap<String,String> testData) {
		String pricePlan = testData.get("Price_Option");
		driver.findElement(By.xpath("//tfoot/tr/th/label/input[@value='"+pricePlan+"']/following-sibling::span")).click();
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}
	
	/*public void validatePrice() {
		//driver.findElement(By.xpath("//table/tbody/tr/td[text()='Price per Year ($)']/following-sibling::td[@data-label='\"+pricePlan+\"']/span")).getText();
		
	}*/
	
	
	
	
}
