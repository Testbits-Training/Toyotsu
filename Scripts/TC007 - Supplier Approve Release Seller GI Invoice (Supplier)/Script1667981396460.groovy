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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameAzwan, ('password') : GlobalVariable.passwordAzwan
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgbafco], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC007/Page_Brivge/h6_Accounting'))

WebUI.click(findTestObject('TC007/Page_Brivge/li_Seller(GI) Invoice List'))

'contract no. generated from so monitoring details '
WebUI.setText(findTestObject('TC007/Page_Brivge/input_contract no list'), 'SGBAFCO TO SGTTAP 1103009')

WebUI.click(findTestObject('TC007/Page_Brivge/button filter'))

WebUI.click(findTestObject('TC007/Page_Brivge/input__statusList'))

WebUI.click(findTestObject('TC007/Page_Brivge/li_New'))

WebUI.click(findTestObject('TC007/Page_Brivge/button_Search'))

y = WebUI.getText(findTestObject('TC007/Page_Brivge/div_invoice No'))

'Save invoice no to c:\\\\toyotsudata.xsl'
CustomKeywords.'util.copyToExcel.exel'(y, 8, 2)

WebUI.click(findTestObject('TC007/Page_Brivge/button approve'))

'Clicking confirm to approve GI Invoice'
WebUI.click(findTestObject('TC007/Page_Brivge/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('TC007/Page_Brivge/p_The operation was successful'))

WebUI.verifyElementText(findTestObject('TC007/Page_Brivge/div_Approved'), 'Approved')

KeywordUtil.markPassed('GI Invoice is approved successfully')

WebUI.click(findTestObject('TC007/Page_Brivge/button release'))

'Clicking confirm to release GI Invoice'
WebUI.click(findTestObject('TC007/Page_Brivge/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('TC007/Page_Brivge/p_The operation was successful'))

WebUI.verifyElementText(findTestObject('TC007/Page_Brivge/div_Released'), 'Released')

KeywordUtil.markPassed('GI Invoice is released successfully')

