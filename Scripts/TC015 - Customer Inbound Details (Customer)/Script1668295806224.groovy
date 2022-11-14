import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import internal.GlobalVariable as KeywordUtil
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

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameLuqman, ('password') : GlobalVariable.passwordLuqman
        , ('verification') : GlobalVariable.verificationLuqman, ('company') : GlobalVariable.vnttvn], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC015/Page_Brivge/button_Logistics'))

WebUI.click(findTestObject('TC015/Page_Brivge/li_Inbound Monitoring List'))

WebUI.click(findTestObject('TC015/Page_Brivge/button_create'))

WebUI.click(findTestObject('TC015/Page_Brivge/button_Download'))

WebUI.verifyElementVisible(findTestObject('TC015/Page_Brivge/p_The operation was successful'))

WebUI.delay(5)

y = CustomKeywords.'util.getDownloadedFile.getLatestFileFromDirectory'()

System.out.println(y)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, '1000', 4, 9)

KeywordUtil.logInfo('Last file received is ' + y)

WebUI.uploadFile(findTestObject('TC015/Page_Brivge/button_Upload'), file)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('TC015/Page_Brivge/p_The operation was successful'))

WebUI.delay(5)

