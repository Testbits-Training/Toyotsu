import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameLuqman, ('password') : GlobalVariable.passwordLuqman
        , ('verification') : GlobalVariable.verificationLuqman, ('company') : GlobalVariable.sgttap], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC007/Page_Brivge/h6_Accounting'))

WebUI.click(findTestObject('TC008/Page_Brivge/li_Buyer(GR) Invoice List'))

WebUI.setText(findTestObject('TC008/Page_Brivge/input_Buyer(GR) Invoice List'), findTestData('Toyotsu-data').getValue(7, 
        2))

WebUI.verifyElementText(findTestObject('TC008/Page_Brivge/div_Released'), 'Released')

WebUI.takeScreenshot()

WebUI.click(findTestObject('TC008/Page_Brivge/button view'))

WebUI.verifyElementVisible(findTestObject('TC008/Page_Brivge/h3_Buyer(GR) Invoice Detail'))

WebUI.takeFullPageScreenshot()

