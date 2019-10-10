package com.crm.vtiger.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.objectRepository.Home;
import com.crm.vtiger.objectRepository.Login;
/*SARE TESTNG ANOOTATION*/

public class BaseClass {
	public static WebDriver d;
	public FileLib flib = new FileLib();
	
	@BeforeClass
	public void configBC() throws Throwable{
	String BROWSER = flib.getPropertyFileData("browser");
	System.out.println("==Launch Browser==");
	
	
	if (BROWSER.equals("chrome")) 
	{
	d = new ChromeDriver();
	}

	else if (BROWSER.equals("firefox")) {
	d = new FirefoxDriver();
	} 
	
	else if (BROWSER.equals("opera")) {
		d = new OperaDriver();
		}
	
	else if (BROWSER.equals("ie")) {
	
	d = new InternetExplorerDriver();
	}}
	
	
	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("BeforeMethod");
	String URL = flib.getPropertyFileData("url");
	String USER = flib.getPropertyFileData("username");
	String PASSWORD = flib.getPropertyFileData("password");

	
	/* Login & navigate to "Home Page " */
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.get(URL);
	
	Login lpage = PageFactory.initElements(d, Login.class);
	lpage.LoginApp(USER, PASSWORD);
	}
	

	

@AfterMethod               
public void configAM() {
	Home hpage = PageFactory.initElements(d, Home.class);
	hpage.logout();
	System.out.println("Logout");
}

@AfterClass
public void configAC () {
System.out.println("Aftter Class");

 /*CLOSE THE BROWSER*/
d.close();
}}







