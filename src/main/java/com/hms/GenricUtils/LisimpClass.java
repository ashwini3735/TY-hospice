package com.hms.GenricUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LisimpClass implements ITestListener {
 
	ExtentReports report;
	ExtentTest Test;
	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		Test = report.createTest(MethodName);
		Reporter.log(MethodName+"---TestScript excution start from hear---");
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String MethodName = result.getMethod().getMethodName();
		Test.log(Status.PASS,MethodName+"--->passsed" );
		Reporter.log(MethodName+"---TestScript Executted Suecessfully----");
		
	}

	public void onTestFailure(ITestResult result) {
		String FS = result.getMethod().getMethodName();
		String FSscript   =FS+ new javaUtiles().systemDateinFormat();
		Test.addScreenCaptureFromPath(FSscript);
		try
		{
			 WebDriverUtils.getScreenShot(BaseClass.sdriver, FSscript);
		}
		catch (Throwable e){
			e.printStackTrace();
			
		}
		Test.log(Status.FAIL, result.getThrowable());
		Test.log(Status.FAIL, FSscript+"--->Falied");
		Reporter.log(FSscript+"----->TestScript execution failed");
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		Test.log(Status.SKIP, MethodName+"--->skiped");
		Test.log(Status.SKIP, result.getThrowable());
		Reporter.log(MethodName+"----TestScript Skepped SuessFully----");
		
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./Extentreport/report.html"); 
		htmlreport.config().setDocumentTitle("SDET-52");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("Hospice");
		
		 report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("url", "http\\://rmgtestingserver/domain/Hospital_Management_System/");
		report.setSystemInfo("Reportername", "Ashwini");
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	

}
