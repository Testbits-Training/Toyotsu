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

WebUI.callTestCase(findTestCase('common/Login'), [('username') : GlobalVariable.usernameAzwan, ('password') : GlobalVariable.passwordAzwan
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgbafco], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC006/Page_Brivge/h6_Logistics'))

WebUI.click(findTestObject('TC006/Page_Brivge/li_Outbound Monitoring List'))

WebUI.click(findTestObject('TC006/Page_Brivge/button create'))

WebUI.callTestCase(findTestCase('common/Long Form/6_1 - input basic info'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('common/Long Form/6_2 - input container info'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('common/Long Form/6_3 - input outer package'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('common/Long Form/6_4 - input add parts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC006/TC006_4/click before scroll up'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.HOME))

WebUI.click(findTestObject('TC006/TC006_4/button_Submit'))

WebUI.click(findTestObject('TC006/Page_Brivge/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('TC006/Page_Brivge/p_The operation was successful'))

