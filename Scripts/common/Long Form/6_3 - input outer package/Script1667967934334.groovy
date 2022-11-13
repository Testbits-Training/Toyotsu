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

WebUI.click(findTestObject('TC006/Page_Brivge/button_ADD OUTER PACKAGE'))

WebUI.setText(findTestObject('TC006/Page_Brivge/input_Outer Package 1_outerPackageNo'), 'O-221028001')

WebUI.click(findTestObject('TC006/Page_Brivge/input_Outer Package 1_outerPackageType'))

WebUI.click(findTestObject('TC006/Page_Brivge/li_CARTONBOX'))

WebUI.setText(findTestObject('TC006/Page_Brivge/input_Outer Package 1_m3'), '10.0')

WebUI.setText(findTestObject('TC006/Page_Brivge/input_Outer Package 1_netWeight'), '10.0')

WebUI.setText(findTestObject('TC006/Page_Brivge/input_Outer Package 1_grossWeight'), '10.0')

