package com.crm.vtiger.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name = "user_name")
	private WebElement Name;
	

	@FindBy(name = "user_password")
	private WebElement Pass;
	
	public WebElement getName() {
		return Name;
	}


	public WebElement getPass() {
		return Pass;
	}


	public WebElement getLbutn() {
		return Lbutn;
	}


	@FindBy(id = "submitButton")
	private WebElement Lbutn;

	/*BUSINESS METHODS*/
	public void LoginApp(String userName, String Password) {
		Name.sendKeys(userName);
		Pass.sendKeys(Password);
		Lbutn.click();
		
	}
	
}
