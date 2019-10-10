package com.crm.vtiger.genericLib;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * 
 * @author singh
 *
 */

/* Step1. (Data are Fetching from properties File)*/
public class FileLib {
String pPath = "./CommonData.properties";			
String ePath = "./29SDETdata.xlsx";


/**
 * Get properties file key value based on your argument
 * @param key
 * @return 
 * @return 5
 * @throws Throwable 
 * @throws trrowable
 */
/*Step 2  (For common data going to use every where) */
    public  String getPropertyFileData(String key) throws Throwable {    //ye method maine banaya hai (Generic hai) isliye cont+space kam nhi karega
	FileInputStream fis = new FileInputStream(pPath);
	Properties pObj = new Properties();
	pObj.load(fis);
	String data = pObj.getProperty(key);
	return data;

}


/**
 * it is used to read the data from ExcelSheet (29SDET.xlsx) based on your Argument
 * @param sheetName, rowNum, celNum
 * @return
 * @throws Throwable 
 * @throws Throwable
 */
/*Step3. For Read the Data from Excel file*/
public String getExcelData(String sheetName, int rowNum, int celNum) throws Throwable
{
	FileInputStream fis = new FileInputStream(ePath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row r = sh.getRow(rowNum);
	Cell c = r.getCell(celNum);
	String data = c.getStringCellValue();
	return data;
}

}
