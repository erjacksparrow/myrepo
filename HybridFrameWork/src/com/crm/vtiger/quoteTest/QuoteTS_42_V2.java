package com.crm.vtiger.quoteTest;

import java.util.Random;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.genericLib.BaseClass;
import com.crm.vtiger.genericLib.WebDriverCommonLib;
import com.crm.vtiger.objectRepository.Home;
import com.crm.vtiger.objectRepository.OrganizationWindow;
import com.crm.vtiger.objectRepository.ProductWindow;
import com.crm.vtiger.objectRepository.Quote;
import com.crm.vtiger.objectRepository.QuoteCreation;
/**
 * 
 * @author Suhrid Singh
 *
 */
@Listeners(com.crm.vtiger.genericLib.ListnerImpClass.class)
public class QuoteTS_42_V2 extends BaseClass {
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	Random r = new Random();
	
	@Test
	public void quoteTest () throws Throwable {
		
		//FileLib flib = new FileLib(); no need

		/* read test script data from Excel */
String Subject=flib.getExcelData("Sheet1", 2, 1);
String Qty=flib.getExcelData("Sheet1", 2, 6);
String Organization=flib.getExcelData("Sheet1", 2, 3);
String Product=flib.getExcelData("Sheet1", 1, 5);
String Curval=flib.getExcelData("Sheet1", 1, 9);

/*STEP 1. Navigate To Home Page click on More & then click on Quote*/
Home hpage=PageFactory.initElements(d, Home.class);
hpage.getMore().click();
hpage.getQuotes().click();

// WHY NOT WORKING ??????????/
/*Actions act = new Actions(BaseClass.d);
act.moveToElement(more).perform();*/

/*STEP 2. Navigate To  Quote*/

Quote qpage = PageFactory.initElements(d, Quote.class);
WebDriverCommonLib wbd= PageFactory.initElements(d, WebDriverCommonLib.class);
wbd.waitExpElement(qpage.getAddquote());

qpage.getAddquote().click();

/* STEP 3. Navigate To  Create Quote */
QuoteCreation cqpage= PageFactory.initElements(d, QuoteCreation.class);
cqpage.getSubject().sendKeys(Subject);
cqpage.getOrgname().click();

wbd.SwitchToChildWindow();

/*TO ADD HP search*/
OrganizationWindow Opop =PageFactory.initElements(d, OrganizationWindow.class);  
Opop.getSearch().sendKeys(Organization);
Opop.getSearchBtn().click();
Opop.getOrgName().click();


wbd.alertclickOk();  

/*Driver control back to main page from child window*/
wbd.SwitchToParentWindow();

/* Click on Add New Item */
cqpage.getProduct().click();
wbd.SwitchToChildWindow();

ProductWindow pw = PageFactory.initElements(d, ProductWindow.class);
pw.getTextbox().sendKeys(Product);
pw.getSearch().click();
pw.getSelectProduct().click();

/*control back to parent window*/
wbd.SwitchToParentWindow();

/*select quantity*/
cqpage.getQty().sendKeys(Qty);
cqpage.getSave().click();


}
}
