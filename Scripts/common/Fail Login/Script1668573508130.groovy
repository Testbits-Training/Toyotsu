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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.brivge.com/home')

WebUI.waitForElementVisible(findTestObject('Object Repository/Login/input_Sign In_username'), 0)

WebUI.setText(findTestObject('Object Repository/Login/input_Sign In_username'), GlobalVariable.usernameAzwan)

WebUI.setText(findTestObject('Object Repository/Login/input_Sign In_password'), GlobalVariable.passwordAzwan)

WebUI.click(findTestObject('Object Repository/Login/span_Sign In'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/input_Verify_verificationCode'))

WebUI.setText(findTestObject('Object Repository/Login/input_Verify_verificationCode'), GlobalVariable.verificationAzwan, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/span_Verify'))

WebUI.verifyElementVisible(findTestObject('TC001/Page_Brivge/Verify_Inbound Record'))

WebUI.click(findTestObject('TC003/button_aazwanSGDC-Azwan'))

WebUI.click(findTestObject('TC003/button_company'))

WebUI.click(findTestObject('Login/li_Company', [('company') : company]))

