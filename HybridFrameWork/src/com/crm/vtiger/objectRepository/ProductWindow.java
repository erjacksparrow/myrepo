package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductWindow {
@FindBy(linkText = "PEN1")
private WebElement product;

@FindBy(id="search_txt")
private WebElement textbox;

@FindBy(id="popup_product_21")
private WebElement SelectProduct;




public WebElement getSelectProduct() {
	return SelectProduct;
}



public WebElement getTextbox() {
	return textbox;
}



public WebElement getSearch() {
		return search;
	}

@FindBy(name= "search") 
private WebElement search;



public WebElement getProduct() {
	return product;
}

}
