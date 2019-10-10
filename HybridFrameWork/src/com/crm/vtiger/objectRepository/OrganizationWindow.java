package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationWindow {
	@FindBy(id  = "search_txt")
	private WebElement search;
	
	@FindBy(name = "search")
	private WebElement searchBtn;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getOrgName() {
		return OrgName;
	}

	@FindBy(linkText = "HP")
	private WebElement OrgName ;
}
