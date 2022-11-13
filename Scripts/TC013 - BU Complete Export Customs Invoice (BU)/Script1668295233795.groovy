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
        , ('verification') : GlobalVariable.verificationLuqman, ('company') : GlobalVariable.sgttap], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC013/Page_Brivge/button_Logistics'))

WebUI.click(findTestObject('TC013/Page_Brivge/li_Customs Invoice List(Export)'))

WebUI.setText(findTestObject('TC013/Page_Brivge/input_Customs Invoice(Export)'), 'TTAP2209007')

'<---- Update cargo status ---->'
WebUI.click(findTestObject('TC013/Page_Brivge/button_update 1'))

WebUI.click(findTestObject('TC013/Page_Brivge/input_Input Cargo Status_cargoStatus'))

WebUI.click(findTestObject('TC013/Page_Brivge/li_Exp clearance in progress'))

WebUI.click(findTestObject('TC013/Page_Brivge/button_update 2'))

WebUI.verifyElementVisible(findTestObject('TC013/Page_Brivge/p_The operation was successful'))

WebUI.delay(5)

'<---- Complete custom invoice ---->'
WebUI.click(findTestObject('TC013/Page_Brivge/button_completed'))

WebUI.click(findTestObject('TC013/Page_Brivge/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('TC013/Page_Brivge/p_The operation was successful'))

'<---- Print invoice ---->'
WebUI.click(findTestObject('TC013/Page_Brivge/button_print 1'))

WebUI.click(findTestObject('TC013/Page_Brivge/div_Print Invoice'))

WebUI.click(findTestObject('TC013/Page_Brivge/button_Print 2'))

WebUI.verifyElementVisible(findTestObject('TC013/Page_Brivge/p_The operation was successful'))

