import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameLuqman, ('password') : GlobalVariable.passwordLuqman
        , ('verification') : GlobalVariable.verificationLuqman, ('company') : GlobalVariable.sgttap], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC007/Page_Brivge/h6_Accounting'))

WebUI.click(findTestObject('TC008/Page_Brivge/li_Buyer(GR) Invoice List'))

'GI Invoice generated from TC007'
WebUI.setText(findTestObject('TC008/Page_Brivge/input_Buyer(GR) Invoice List'), 'BA2211005')

WebUI.verifyElementText(findTestObject('TC008/Page_Brivge/div_Released'), 'Released')

WebUI.verifyElementText(findTestObject('TC008/Page_Brivge/div_SGBAFCO TO SGTTAP 1103009'), 'SGBAFCO TO SGTTAP 1103009')

WebUI.takeScreenshot()

WebUI.click(findTestObject('TC008/Page_Brivge/button view'))

WebUI.verifyElementVisible(findTestObject('TC008/Page_Brivge/h3_Buyer(GR) Invoice Detail'))

WebUI.takeFullPageScreenshot()

