package com.crm.vtiger.genericLib;





import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	static Set<String> set;
	static Iterator<String> it;

	public void waitForPageToLoad() 
	{
	 BaseClass.d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    
	public void waitExpElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.d, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	public void select(WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void select(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void actionsmovetoelement(WebElement element)
	{
		 Actions act = new Actions(BaseClass.d);
		 act.moveToElement(element).perform();
	}
	
	// Capture all the session id from set collection using iterator
	public void SwitchToChildWindow()
	{
	set = BaseClass.d.getWindowHandles();
	// capture the session id
	it = set.iterator();
	String parentWinId = it.next();
	String childWinId = it.next();
	// Pass Driver Control
	BaseClass.d.switchTo().window(childWinId);
	//Static class hai isliye hm use class name se acess kr rhe hai dusre class me
	}
	
	public void SwitchToParentWindow()
	{
	set = BaseClass.d.getWindowHandles();
	// capture the session id
	it = set.iterator();
	String parentWinId = it.next();
	// Pass Driver Control
	BaseClass.d.switchTo().window(parentWinId);
	}
	
	
	public String alertcapturemessage() 
	{
	 Alert alt = BaseClass.d.switchTo().alert();
     return alt.getText();
	}
     
     public void alertclickOk() 
 	{
 	 Alert alt = BaseClass.d.switchTo().alert();
      alt.accept();
}
}
