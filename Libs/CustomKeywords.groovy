
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import java.io.File

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize



def static "util.parseValue.parseAValueToWebObject"(
    	TestObject to	
     , 	String text	) {
    (new util.parseValue()).parseAValueToWebObject(
        	to
         , 	text)
}


def static "util.copyToExcel.exel"(
    	String name	
     , 	int rowNum	
     , 	int colNum	) {
    (new util.copyToExcel()).exel(
        	name
         , 	rowNum
         , 	colNum)
}


def static "util.copyToExcel.exelInboundPlan"(
    	File file	
     , 	String name	
     , 	int rowNum	
     , 	int colNum	) {
    (new util.copyToExcel()).exelInboundPlan(
        	file
         , 	name
         , 	rowNum
         , 	colNum)
}

 /**
	 * Refresh browser
	 */ 
def static "util.test.refreshBrowser"() {
    (new util.test()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "util.test.clickElement"(
    	TestObject to	) {
    (new util.test()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "util.test.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new util.test()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "util.generateTime.dateTimeGenerator"() {
    (new util.generateTime()).dateTimeGenerator()
}


def static "util.getDownloadedFile.getLatestFileFromDirectory"() {
    (new util.getDownloadedFile()).getLatestFileFromDirectory()
}


def static "util.handlePicker2.handleCalendar"(
    	TestObject currentMonthYear	
     , 	TestObject nextMonthButton	
     , 	int inputDay	
     , 	int inputMonth	) {
    (new util.handlePicker2()).handleCalendar(
        	currentMonthYear
         , 	nextMonthButton
         , 	inputDay
         , 	inputMonth)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
