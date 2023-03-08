package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.ObjectsRepo;

public class ListenersImplementation extends ObjectsRepo implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
		//before each test case
		test=report.createTest(result.getMethod().getMethodName());
	}                                                                  	

	@Override 
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case:"+result.getMethod().getMethodName()+" is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case:"+result.getMethod().getMethodName()+" is Failed");
		test.log(Status.FAIL, result.getThrowable());
		
		//add Screenshot
		/*SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		Date date=new Date();
		String formatedDate=format.format(date);
		String screenshotPath=System.getProperty("user-dir")+"./Reports/Screenshots/"+formatedDate+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(screenshotPath);
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		Date date=new Date();
		String formatedDate=format.format(date);
		
		//String random=result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		String filePath=System.getProperty("user.dir")+"./Reports/Screenshots/Screenshot_"+formatedDate+".png";
		File des=new File(filePath);
		try {
			FileUtils.copyFile(src, des);
		} 
		catch (IOException e) {
		}	
		test.addScreenCaptureFromPath(filePath, "Test Case Failure ScreenShot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		//setup extentReport
		report=ExtentSetup.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		//close extent
		report.flush();
	} 

}
