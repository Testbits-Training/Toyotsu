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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
public class handlePicker {


	public findIndex(String[] arr, String t) {

		// if array is Null
		if (arr == null) {
			return -1;
		}

		// find length of array
		int len = arr.length;
		int i = 0;

		// traverse in the array
		while (i < len) {

			// if the i-th element is t
			// then return the index
			if (arr[i] == t) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
	}


	@Keyword
	public void handleCalendar(TestObject currentMonthYear, TestObject nextMonthButton, int inputDay, int inputMonth ) {

		WebElement next = WebUiBuiltInKeywords.findWebElement(nextMonthButton);
		int inputMonthIndex = inputMonth - 1;

		String[] monthInYear = [
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October" ,
			"November",
			"December"
		];

		while(true) {

			WebElement getCurrentMonthYear = WebUiBuiltInKeywords.findWebElement(currentMonthYear);

			// get month from text for example we want to extract the MONTH from "November 2022"
			String text = getCurrentMonthYear.getText();
			text = text.replaceAll("\\s","");
			text = text.replaceAll("\\d","");

			// find current month index from monthInYear[]
			int monthIndex = findIndex(monthInYear,text);

			if (inputMonthIndex != monthIndex) {

				next.click(); //click next month button
				Thread.sleep(500); //slowing the execution
			}

			else {
				break; //stop clicking when we got the desired month
			}
		}

		WebDriver driver = DriverFactory.getWebDriver();
		WebElement day = driver.findElement(By.xpath("//button[@type = 'button' and (text() = '" + inputDay+ "' or . = '" + inputDay + "')]"));
		//WebElement day = driver.findElement(By.xpath("//*[@class = 'lcbm-MuiButtonBase-root lcbm-MuiIconButton-root lcbm-MuiPickersDay-day' and @type = 'button' and (text() = '" + inputDay + "' or . = '"+inputDay+ "')]"));

		day.click();
	}
}

