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

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameAzwan, ('password') : GlobalVariable.passwordAzwan
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgbafco], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC005/h6_Order'))

WebUI.click(findTestObject('TC005/li_ChangeCancel Request List'))

if (WebUI.verifyElementVisible(findTestObject('TC005/h1_What can you do in Change or Cancel Request List')) == true) {
    WebUI.click(findTestObject('TC005/span_X'))
}

WebUI.setText(findTestObject('TC005/input Search'), findTestData('Toyotsu-data').getValue(1, 2))

WebUI.click(findTestObject('TC005/button filter'))

WebUI.click(findTestObject('TC005/input__requestStatusList'))

WebUI.click(findTestObject('TC005/li_New'))

WebUI.click(findTestObject('TC005/button_Search'))

WebUI.click(findTestObject('TC005/button detail'))

WebUI.click(findTestObject('TC005/button_Approve'))

WebUI.verifyElementVisible(findTestObject('TC005/p_The operation was successful'))

