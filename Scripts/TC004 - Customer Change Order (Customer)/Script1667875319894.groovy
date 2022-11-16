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

WebUI.click(findTestObject('TC001/h6_Order'))

WebUI.click(findTestObject('delete order summary/li_Place ChangeCancel'))

'Contract Route No. generated from TC001'
WebUI.focus(findTestObject('delete order summary/input_Forecast Change'), 
    FailureHandling.STOP_ON_FAILURE)

'Contract Route No. generated from TC001'
WebUI.setText(findTestObject('delete order summary/input_Forecast Change'), 
    findTestData('Toyotsu-data').getValue(1, 2))

WebUI.delay(2)

WebUI.click(findTestObject('TC004/create button'))

WebUI.doubleClick(findTestObject('TC004/input 1'))

WebUI.sendKeys(findTestObject('TC004/input 1'), '1500')

WebUI.doubleClick(findTestObject('TC004/input 2'))

WebUI.sendKeys(findTestObject('TC004/input 2'), '1500')

WebUI.click(findTestObject('TC004/button input shipping plan'))

WebUI.click(findTestObject('TC004/input__newInboundPlanDate'))

WebUI.doubleClick(findTestObject('TC004/button next calendar'))

WebUI.doubleClick(findTestObject('TC004/button next calendar'))

WebUI.doubleClick(findTestObject('TC004/button next calendar'))

WebUI.click(findTestObject('TC004/button_17'))

WebUI.click(findTestObject('TC004/button_Confirm input plan'))

WebUI.doubleClick(findTestObject('TC004/input 3'))

WebUI.sendKeys(findTestObject('TC004/input 3'), '1500')

WebUI.doubleClick(findTestObject('TC004/input 4'))

WebUI.sendKeys(findTestObject('TC004/input 4'), '1500')

y = CustomKeywords.'util.generateTime.dateTimeGenerator'()

CustomKeywords.'util.copyToExcel.exel'(y, 1, 1)

WebUI.doubleClick(findTestObject('TC004/input_Basic info (order summary)_customerRefNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC004/input_Basic info (order summary)_customerRefNo'), y)

WebUI.click(findTestObject('TC004/div_scroll'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.HOME))

WebUI.click(findTestObject('TC004/button_issue'))

WebUI.click(findTestObject('TC004/button_CONFIRM'))

WebUI.verifyElementPresent(findTestObject('TC003/p_The operation was successful'), 0)

