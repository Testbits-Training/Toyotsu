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

WebUI.click(findTestObject('TC012/button_Accounting'))

WebUI.click(findTestObject('TC012/li_Seller(GI) Invoice List'))

WebUI.click(findTestObject('TC012/input_Seller(GI) Invoice List'))

WebUI.setText(findTestObject('TC012/input_Seller(GI) Invoice List'), GlobalVariable.custContractNo)

invoiceNo = WebUI.getText(findTestObject('TC012/p_invoiceNo'))

CustomKeywords.'util.copyToExcel.exel'(invoiceNo, 1, 11)

WebUI.check(findTestObject('TC012/input_SGTTAP TO VNTTVN 1103010'))

WebUI.scrollToElement(findTestObject('TC012/div_Status'), 0)

WebUI.click(findTestObject('TC012/button_Approve'))

WebUI.waitForElementPresent(findTestObject('TC012/div_ApproveAre you sure to do Approve'), 0)

WebUI.click(findTestObject('TC012/button_CONFIRM'))

