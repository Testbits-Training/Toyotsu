import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameAzwan, ('password') : GlobalVariable.passwordAzwan
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgttapdc], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC010/Page_Brivge/span_Logistics'))

WebUI.click(findTestObject('TC010/Page_Brivge/li_Inbound Monitoring List'))

'generated from TC001'
WebUI.setText(findTestObject('TC010/Page_Brivge/input_inbound list'), findTestData('Toyotsu-data').getValue(6, 2))

WebUI.click(findTestObject('TC010/Page_Brivge/checkbox'))

WebUI.click(findTestObject('TC010/Page_Brivge/button download'))

WebUI.click(findTestObject('TC010/Page_Brivge/li_Download Inbound Plan'))

WebUI.verifyElementVisible(findTestObject('TC010/Page_Brivge/p_The operation was successful'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

filename = CustomKeywords.'util.getDownloadedFile.getLatestFileFromDirectory'()

KeywordUtil.logInfo('Last file received is ' + filename)

WebUI.click(findTestObject('TC010/Page_Brivge/button confirm'))

'input inbound ref no'
timestamp = CustomKeywords.'util.generateTime.dateTimeGenerator'()

String inboundRefNo = 'inbound' + timestamp

CustomKeywords.'util.copyToExcel.exel'(inboundRefNo, 1, 8)

WebUI.setText(findTestObject('TC010/Page_Brivge/input__inboundRefNo'), inboundRefNo)

'input inbound date'
WebUI.click(findTestObject('TC010/Page_Brivge/input__inboundDate'))

CustomKeywords.'util.handlePicker.handleCalendar'(findTestObject('TC010/Page_Brivge/currentmonth'), findTestObject('TC010/Page_Brivge/button next calendar'), 
    1, 14)

'Input time'
CustomKeywords.'util.parseValue.parseAValueToWebObject'(findTestObject('TC010/Page_Brivge/input__inboundTime'), '12:00:00')

WebUI.click(findTestObject('TC010/Page_Brivge/button_Confirm 2'))

WebUI.click(findTestObject('TC010/Page_Brivge/button_CONFIRM 3'))

WebUI.verifyElementVisible(findTestObject('TC010/Page_Brivge/p_The operation was successful'))

