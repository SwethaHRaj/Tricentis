package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Home_PageObjects extends BaseClass{
	
	/*@FindBy(id="nav_automobile")
	WebElement link_automobile;
	
	@FindBy(id="nav_truck")
	WebElement link_truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement link_motorcycle;

	@FindBy(id="nav_camper")
	WebElement link_camper;*/
	
	public Home_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLink(HashMap<String,String> testData) {
		String vehicleType=testData.get("Vehicle_Type");
		driver.findElement(By.xpath("//div[@class='main-navigation']//a[text()='"+vehicleType+"']")).click();
	}
}
