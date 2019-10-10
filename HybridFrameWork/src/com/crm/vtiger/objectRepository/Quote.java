package com.crm.vtiger.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quote {
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement addquote;

	public WebElement getAddquote() {
		return addquote;
	}
	}
