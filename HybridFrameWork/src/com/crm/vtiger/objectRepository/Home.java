package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.vtiger.genericLib.BaseClass;

public class Home {
@FindBy(linkText = "More")
private WebElement more;


@FindBy(linkText = "Quotes")
private WebElement quotes;

/*For Logout*/

@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement logoimg;

public WebElement getLogoimg() {
	return logoimg;
}

public WebElement getSignOut() {
	return signOut;
}


@FindBy(linkText = "Sign Out")
private WebElement signOut;


public void logout(){
	Actions act = new Actions(BaseClass.d);
	act.moveToElement(logoimg).perform();
	signOut.click();
	
}

public WebElement getMore() {
	return more;
}


public WebElement getQuotes() {
	return quotes;
}

}
