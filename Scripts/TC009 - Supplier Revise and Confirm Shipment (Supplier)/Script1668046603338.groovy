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

WebUI.click(findTestObject('TC009/Page_Brivge/h6_Logistics'))

WebUI.click(findTestObject('TC009/Page_Brivge/li_Shipping Detail List'))

'Booking no from TC006(timestamp) will change later'
WebUI.setText(findTestObject('TC009/Page_Brivge/input_Shipping Detail List'), 'C-221028001')

WebUI.click(findTestObject('TC009/Page_Brivge/button_edit'))

y = CustomKeywords.'util.generateTime.dateTimeGenerator'()

'choose date for atd'
WebUI.click(findTestObject('TC009/Page_Brivge/input__atd'))

WebUI.click(findTestObject('TC009/Page_Brivge/button next atd calendar'))

WebUI.click(findTestObject('TC009/Page_Brivge/button_1'))

'choose bl date'
WebUI.click(findTestObject('TC009/Page_Brivge/input__blDate'))

WebUI.click(findTestObject('TC009/Page_Brivge/button next bl calendar'))

WebUI.click(findTestObject('TC009/Page_Brivge/button_15'))

'input bl no'
WebUI.setText(findTestObject('TC009/Page_Brivge/input__blNo'), 'BL No ' + y)

'input vogaye no'
WebUI.setText(findTestObject('TC009/Page_Brivge/input__voyageNo'), 'voyage ' + y)

'input vessel name'
WebUI.setText(findTestObject('TC009/Page_Brivge/input__vesselName'), 'Vessel A')

WebUI.click(findTestObject('TC009/Page_Brivge/input__cargoStatus'))

WebUI.click(findTestObject('TC009/Page_Brivge/li_Cargo Outbound'))

WebUI.click(findTestObject('TC009/Page_Brivge/button_Confirm'))

WebUI.verifyElementVisible(findTestObject('TC009/Page_Brivge/p_Are you sure to do Confirm(c0001)'))

WebUI.click(findTestObject('TC009/Page_Brivge/button_CONFIRM 2'))

WebUI.verifyElementVisible(findTestObject('TC007/Page_Brivge/p_The operation was successful'))

