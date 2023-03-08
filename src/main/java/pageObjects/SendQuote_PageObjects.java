package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SendQuote_PageObjects extends BaseClass{
	
	@FindBy(id="sendquote")
	WebElement link_sendQuote;
	
	@FindBy(id="email")
	WebElement tb_email;
	
	@FindBy(id="phone")
	WebElement tb_phone;
	
	@FindBy(id="username")
	WebElement tb_username;
	
	@FindBy(id="password")
	WebElement tb_password;
	
	@FindBy(id="confirmpassword")
	WebElement tb_confirmpassword;
	
	@FindBy(id="Comments")
	WebElement ta_comments;
	
	@FindBy(id="prevselectpriceoption")
	WebElement btn_prev;
	
	@FindBy(id="sendemail")
	WebElement btn_send;
	
	public SendQuote_PageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void sendQuote(HashMap<String,String> testData) {
		tb_email.sendKeys(testData.get("Quote_E-Mail"));
		tb_phone.sendKeys(testData.get("Quote_Phone"));
		tb_username.sendKeys(testData.get("Quote_Username"));
		tb_password.sendKeys(testData.get("Quote_Password"));
		tb_confirmpassword.sendKeys(testData.get("Quote_Confirm Password"));
		ta_comments.sendKeys(testData.get("Quote_Comments"));
	}
	
	public void clickOnSendButton() {
		btn_send.click();
	}

}
