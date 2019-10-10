package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteInfo {
	@FindBy(xpath = "//b[contains(text(),'Currency')]/..")
	private WebElement QuoteInfo;

	public WebElement getQuoteInfo() {
		return QuoteInfo;
	}

}
