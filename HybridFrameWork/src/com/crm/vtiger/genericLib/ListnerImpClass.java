
  package com.crm.vtiger.genericLib;
  
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
  
  public class ListnerImpClass implements ITestListener{ 
	  public void  onTestFailure(ITestResult result) 
	  { 
		  String Ftest = result.getMethod().getMethodName();
  
  EventFiringWebDriver eDriver =new EventFiringWebDriver(BaseClass.d);
  
  File srcFile = eDriver.getScreenshotAs(OutputType.FILE); 
  File destFile= new File("./ScreenShots/"+Ftest+".png");
  
  try { FileUtils.copyFile(srcFile, destFile); } catch (Exception e) {
  
  
  } }

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	} }
 