package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectsRepo;

public class ExtentSetup extends ObjectsRepo{
	
	public static ExtentReports setupExtentReport() {
		
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		Date date=new Date();
		String formatedDate=format.format(date);
		String reportPath=System.getProperty("user.dir")+"./Reports/ExtentReports/ExectionReport_"+formatedDate+".html";
		ExtentSparkReporter sparkReport=new ExtentSparkReporter(reportPath);
		report = new ExtentReports();
		report.attachReporter(sparkReport);
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("ReportName");
		
	return report;
	}
}
