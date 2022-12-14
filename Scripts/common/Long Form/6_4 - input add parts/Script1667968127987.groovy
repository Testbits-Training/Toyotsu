import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('TC006/Page_Brivge/button_ADD PARTS'))

WebUI.setText(findTestObject('TC006/TC006_4/input_inner_part_list_search'), findTestData('Toyotsu-data').getValue(3, 2))

WebUI.check(findTestObject('TC006/TC006_4/input_checkboxAll'))

WebUI.click(findTestObject('TC006/TC006_4/button_OK'))

a = WebUI.getText(findTestObject('TC006/TC006_4/not yet delivery price 1'))

b = WebUI.getText(findTestObject('TC006/TC006_4/not yet delivery price 2'))

WebUI.click(findTestObject('TC006/TC006_4/input_ADD PARTS_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC006/TC006_4/input_ADD PARTS_1'), a)

WebUI.click(findTestObject('TC006/TC006_4/input_ADD PARTS_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC006/TC006_4/input_ADD PARTS_2'), b)

