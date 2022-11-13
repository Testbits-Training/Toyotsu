import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgbafco], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC001/h6_Order'))

WebUI.click(findTestObject('TC003/li_SO Monitoring List'))

WebUI.verifyElementVisible(findTestObject('TC003/div_what can you do in SO monitoring'), FailureHandling.OPTIONAL)

if (WebUI.verifyElementVisible(findTestObject('TC003/div_what can you do in SO monitoring'), FailureHandling.OPTIONAL) == 
true) {
    WebUI.click(findTestObject('TC003/span_closeModel'))
}

WebUI.setText(findTestObject('TC003/input_SO Monitoring List Search'), GlobalVariable.supplContractNo)

WebUI.click(findTestObject('TC003/filter button'))

WebUI.click(findTestObject('TC003/input__statusList'))

WebUI.click(findTestObject('TC003/li_Received'))

WebUI.click(findTestObject('TC003/button_Search'))

WebUI.click(findTestObject('TC003/button detail'))

WebUI.verifyElementAttributeValue(findTestObject('TC003/input_Please input related basic information_status'), 'value', 
    'Received', 0)

y = WebUI.getAttribute(findTestObject('TC003/input_Please input related basic information_orderNo'), 'value')

System.out.println('sales order no: ' + y)

WebUI.click(findTestObject('TC003/button_Confirm'))

WebUI.waitForElementVisible(findTestObject('TC003/p_Are you sure to do Confirm(c0001)'), 0)

WebUI.click(findTestObject('TC003/button_CONFIRM (1)'))

WebUI.verifyElementVisible(findTestObject('TC003/p_The operation was successful'))

