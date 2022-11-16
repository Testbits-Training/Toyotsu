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
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat;

import java.util.Date;

public class generateTime {
	
	
	@Keyword
	public int currentMonth(){
		
	 Date date = new Date();
	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	 String str = formatter.format(date);
	 
	 str = str.substring(3,5);
	 int month = Integer.parseInt(str);
	 
	 return month;
	}
	
	@Keyword
	public int currentDateDay(){
		
	 Date date = new Date();
	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	 String str = formatter.format(date);
	 
	 str = str.substring(0,2);
	 
	 int day = Integer.parseInt(str);
	 
	 return day;
	}
	
	
	@Keyword
	public String dateTimeGenerator() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuuMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String current = dtf.format(now);

		return current;
	}
}

