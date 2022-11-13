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

WebUI.click(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_containerType'))

WebUI.click(findTestObject('TC006/Page_Brivge/li_20FT'))

'input container no'
WebUI.setText(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_containerNo'), 'C-221028001')

'input container seal no'
WebUI.setText(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_sealNo'), 'C-221028001')

'input m3'
WebUI.setText(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_m3'), '1000')

'input net weight'
WebUI.setText(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_netWeight'), '1000')

'input gross weight'
WebUI.setText(findTestObject('TC006/Page_Brivge/input_ADD CONTAINER_grossWeight'), '1000')

