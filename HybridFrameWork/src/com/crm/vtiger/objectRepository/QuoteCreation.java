package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteCreation {
@FindBy(name = "subject")
private WebElement Subject;

@FindBy(xpath = "//input[@id='single_accountid']/following-sibling::img")
private WebElement Orgname;

@FindBy(xpath = "//img[@title='Products']")
private WebElement Product;

@FindBy(xpath = "//input[@class='detailedViewTextBoxOn']")
private WebElement Qty;

public WebElement getSubject() {
	return Subject;
}

public WebElement getOrgname() {
	return Orgname;
}



public WebElement getProduct() {
	return Product;
}

public WebElement getQty() {
	return Qty;
}

public WebElement getSave() {
	return Save;
}

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement Save;


	
}
