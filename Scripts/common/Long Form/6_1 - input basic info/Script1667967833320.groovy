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

WebUI.click(findTestObject('TC006/Page_Brivge/input__buyer'))

WebUI.setText(findTestObject('TC006/Page_Brivge/input__buyer'), findTestData('Toyotsu-data').getValue(4, 2))

WebUI.sendKeys(findTestObject('TC006/Page_Brivge/input__buyer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC006/Page_Brivge/input__receiver'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC006/Page_Brivge/input__receiver'), findTestData('Toyotsu-data').getValue(5, 2))

WebUI.sendKeys(findTestObject('TC006/Page_Brivge/input__receiver'), Keys.chord(Keys.ENTER))

y = CustomKeywords.'util.generateTime.dateTimeGenerator'()

String outBoundRefNo = 'o-' + y

String bookingNo = 'BN' + y

CustomKeywords.'util.copyToExcel.exel'(outBoundRefNo, 1, 5)

WebUI.setText(findTestObject('TC006/Page_Brivge/input__outboundRefNo'), outBoundRefNo)

WebUI.setText(findTestObject('TC006/Page_Brivge/input__bookingNo'), bookingNo)

CustomKeywords.'util.copyToExcel.exel'(bookingNo, 1, 7)

'Choose date for ETD - 1/12/2022'
WebUI.click(findTestObject('TC006/Page_Brivge/input__etd'))

WebUI.click(findTestObject('TC006/Page_Brivge/button next estimated date departure'))

WebUI.click(findTestObject('TC006/Page_Brivge/button_1'))

'Choose date for ETA - 15/12/2022'
WebUI.click(findTestObject('TC006/Page_Brivge/input__eta'))

WebUI.click(findTestObject('TC006/Page_Brivge/button next time for arrival'))

WebUI.click(findTestObject('TC006/Page_Brivge/button_15'))

