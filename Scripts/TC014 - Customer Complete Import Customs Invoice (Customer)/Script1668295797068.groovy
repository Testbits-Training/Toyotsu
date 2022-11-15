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

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameLuqman, ('password') : GlobalVariable.passwordLuqman
        , ('verification') : GlobalVariable.verificationLuqman, ('company') : GlobalVariable.vnttvn], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC014/Page_Brivge/button_Logistics'))

WebUI.click(findTestObject('TC014/Page_Brivge/li_Customs Invoice List(Import)'))

WebUI.setText(findTestObject('TC014/Page_Brivge/input_Customs Invoice(Import)'), findTestData('Toyotsu-data').getValue(12, 
        2))

WebUI.click(findTestObject('TC014/Page_Brivge/input_checkbox'))

WebUI.click(findTestObject('TC014/Page_Brivge/button_input cargo status'))

WebUI.click(findTestObject('TC014/Page_Brivge/input_Input Cargo Status_cargoStatus'))

WebUI.click(findTestObject('TC014/Page_Brivge/li_Imp clearance in progress'))

WebUI.click(findTestObject('TC014/Page_Brivge/button_update'))

WebUI.verifyElementVisible(findTestObject('TC014/Page_Brivge/p_The operation was successful'))

WebUI.delay(5)

WebUI.click(findTestObject('TC014/Page_Brivge/button_complete'))

WebUI.click(findTestObject('TC014/Page_Brivge/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('TC014/Page_Brivge/p_The operation was successful'))

WebUI.verifyElementText(findTestObject('TC014/Page_Brivge/div_Imp clearance in progress'), 'Imp clearance in progress')

WebUI.verifyElementText(findTestObject('TC014/Page_Brivge/div_Customs Clearance Completed'), 'Customs Clearance Completed')

