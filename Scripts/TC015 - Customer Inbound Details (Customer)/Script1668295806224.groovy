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

file = CustomKeywords.'util.copyToExcel.exelInboundPlan2'(y, 'test1', 4, 9)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test2', 4, 2)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test3', 4, 3)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test4', 4, 4)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test5', 4, 6)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test6', 4, 7)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test7', 4, 8)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test8', 4, 16)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test9', 4, 17)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test10', 4, 26)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test11', 4, 27)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test12', 4, 32)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test13', 4, 33)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test14', 4, 34)

file = CustomKeywords.'util.copyToExcel.exelInboundPlan'(y, 'test15', 4, 38)

KeywordUtil.logInfo('Last file received is ' + y)

WebUI.uploadFile(findTestObject('TC015/Page_Brivge/button_Upload'), file)

