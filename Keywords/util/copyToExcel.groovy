package util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.file.Path
public class copyToExcel {

	@Keyword
	public void exel(String name , int rowNum, int colNum) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\toyotsudata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(colNum);
		cell.setCellValue(name);
		FileOutputStream fos = new FileOutputStream("C:\\toyotsudata.xlsx");
		workbook.write(fos);
		fos.close();
	}
	
	@Keyword
	public String exelInboundPlan(File file, String name, int rowNum, int colNum) throws IOException{
		
		//convert downloaded File to Path
		Path path = file.getAbsolutePath();
		
		//open excel file
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//edit 
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(colNum);
		cell.setCellValue(name);
		
		//close 
		FileOutputStream fos = new FileOutputStream(path);
		workbook.write(fos);
		fos.close();
		
		//return the file path for upload
		System.out.println("File path is: " + path);
		return path;
		
	}
}
