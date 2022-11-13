import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameAzwan, ('password') : GlobalVariable.passwordAzwan
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgttapdc], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC010/Page_Brivge/span_Logistics'))

WebUI.click(findTestObject('TC010/Page_Brivge/li_Inbound Monitoring List'))

'generated from TC001'
WebUI.setText(findTestObject('TC010/Page_Brivge/input_inbound list'), 'sWW-2210003')

WebUI.click(findTestObject('TC010/Page_Brivge/checkbox'))

WebUI.click(findTestObject('TC010/Page_Brivge/button download'))

WebUI.click(findTestObject('TC010/Page_Brivge/li_Download Inbound Plan'))

WebUI.verifyElementVisible(findTestObject('TC010/Page_Brivge/p_The operation was successful'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

filename = CustomKeywords.'util.getDownloadedFile.getLatestFileFromDirectory'()

KeywordUtil.logInfo('Last file received is ' + filename)

WebUI.click(findTestObject('TC010/Page_Brivge/button confirm'))

timestamp = CustomKeywords.'util.generateTime.dateTimeGenerator'()

WebUI.setText(findTestObject('TC010/Page_Brivge/input__inboundRefNo'), 'inbound-' + timestamp)

WebUI.click(findTestObject('TC010/Page_Brivge/input__inboundDate'))

CustomKeywords.'util.handlePicker2.handleCalendar'(findTestObject('TC010/Page_Brivge/currentmonth'), findTestObject('TC010/Page_Brivge/button next calendar'), 
    15, 4)

CustomKeywords.'util.parseValue.parseAValueToWebObject'(findTestObject('TC010/Page_Brivge/input__inboundTime'), '12:01:00')

WebUI.click(findTestObject('TC010/Page_Brivge/button_Confirm 2'))

