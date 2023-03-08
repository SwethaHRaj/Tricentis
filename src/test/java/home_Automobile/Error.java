package home_Automobile;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.BaseClass;

public class Error extends BaseClass{  
	
	
	@Test(enabled=false)
	public void verifyErrorMessage_EnginePerformance() {
		//navigate
		//click on Automobile
		homePage.clickOnAutomobile();
		//enter EnginePeformance
		vehicleData.enterValueForEnginePerformance("3333");
		//report
		test.log(Status.PASS, "Engine Performance value set with 3333");
		
		//verify error message
		String actualError=vehicleData.getErrorMessageOnEnginePerformance();
		String expectedError="Must be a number between 1 and 2000"; // true data
		Assert.assertEquals(actualError, expectedError,"Error msg failure: in Engine Performance component");
	}
	
	@Test(enabled=false)
	public void verifyErrorMessage_EnginePerformance1() {
		//navigate
		//click on Automobile
		homePage.clickOnAutomobile();
		//enter EnginePeformance
		vehicleData.enterValueForEnginePerformance("3333");
		//verify error message
		String actualError=vehicleData.getErrorMessageOnEnginePerformance();
		String expectedError="Must be a number between 1 and 20"; //false data
		Assert.assertEquals(actualError, expectedError,"Error msg failure: in Engine Performance component");
	}
	
	@Test(enabled=false)
	public void verifyDropDownListOptions() {
		homePage.clickOnAutomobile();
		List<String> actualOptions=vehicleData.getOptionsOfMakeDropDown();
		List<String> ExpectedOptions=Arrays.asList("– please select –", "Audi", "BMW", "Ford", "Honda","Mazda", "Mercedes Benz", 
		 "Nissan", "Opel", "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo");
		Assert.assertEquals(actualOptions,ExpectedOptions,"DropDownList Options are Not Matching");
	}
}
