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

'Login with user Luqman and VN-TTVN\r\n'
WebUI.click(findTestObject('TC001/h6_Order'))

WebUI.click(findTestObject('TC001/p_Place Order'))

WebUI.waitForElementVisible(findTestObject('TC001/input_Spot Order'), 
    0)

WebUI.setText(findTestObject('TC001/input_Spot Order'), 
    GlobalVariable.custContractNo)

WebUI.verifyElementText(findTestObject('TC001/verify_div_SGTTAP TO VNTTVN 1028002'), GlobalVariable.custContractNo, FailureHandling.OPTIONAL)

y = WebUI.getText(findTestObject('TC003/div_CR-VN-TTVN-2210020'))

CustomKeywords.'util.copyToExcel.exel'(y, 1, 0)

WebUI.click(findTestObject('TC001/button_2'))

WebUI.click(findTestObject('TC001/button_4'))

WebUI.doubleClick(findTestObject('TC001/input number 1'))

WebUI.sendKeys(findTestObject('TC001/input number 1'), '1000', FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('TC001/input number 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC001/input number 2'), '1000')

WebUI.doubleClick(findTestObject('TC001/input number 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC001/input number 3'), '1000')

WebUI.doubleClick(findTestObject('TC001/input number 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC001/input number 4'), '1000')

WebUI.click(findTestObject('TC001/button_5'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC001/button_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC001/input__inboundPlanDate'))

WebUI.click(findTestObject('TC001/button date'))

WebUI.click(findTestObject('TC001/button date'))

WebUI.click(findTestObject('TC001/button date'))

WebUI.click(findTestObject('TC001/button date'))

WebUI.click(findTestObject('TC001/button_17'))

WebUI.click(findTestObject('TC001/button_Confirm'))

WebUI.click(findTestObject('TC001/input number 5'))

WebUI.sendKeys(findTestObject('TC001/input number 5'), '1000')

WebUI.click(findTestObject('TC001/input number 6'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC001/input number 6'), '1000')

WebUI.click(findTestObject('TC001/button_3'))

currentTime = CustomKeywords.'util.generateTime.dateTimeGenerator'()

CustomKeywords.'util.copyToExcel.exel'(currentTime, 1, 1)

WebUI.setText(findTestObject('TC001/input_Basic info (order summary)_orderRefNo'), currentTime)

WebUI.click(findTestObject('TC001/button_issue'))

WebUI.click(findTestObject('TC001/button_CONFIRM (1)'))

WebUI.verifyElementVisible(findTestObject('TC001/p_The operation was successful'))

