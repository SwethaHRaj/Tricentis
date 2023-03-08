 package home_Automobile;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.BaseClass;


public class EndToEnd extends BaseClass{
	
	ExcelOperations excel=new ExcelOperations("Sheet1");
	
	@Test(dataProvider = "data")
	public void calculateInsurance(Object ob) throws Exception {
		
		HashMap<String,String> testData=(HashMap <String, String>) ob;
		
		homePage.clickOnLink(testData);
		vehicleData.enterVehicleData(testData);
		vehicleData.clickOnNextButton();
		insurantData.enterInsurantData(testData);
		insurantData.clickOnNextButton();
		productData.enterProductData(testData);
		productData.clickOnNextButton();
		priceOption.selectPriceOption(testData);
		priceOption.clickOnNextButton();
		quote.sendQuote(testData);
		quote.clickOnSendButton(); 
	}
	
	@DataProvider(name="data")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj=new Object[excel.getRowCount()][1];
		HashMap<String,String> testData = null;
		for(int i=0;i<excel.getRowCount();i++) {
			testData=excel.getTestDataInMap(i+1);
			obj[i][0]=testData;
		}
		return obj;
	}
	
	
}










