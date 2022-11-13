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

WebUI.click(findTestObject('TC001/h6_Order'))

WebUI.click(findTestObject('delete order summary/li_Place ChangeCancel'))

WebUI.setText(findTestObject('delete order summary/input_Forecast Change_lcbm-MuiInputBase-input lcbm-MuiFilledInput-input lcbm-lcbm110 lcbm-MuiInputBase-inputAdornedEnd lcbm-MuiFilledInput-inputAdornedEnd'), 
    GlobalVariable.custContractNo)

WebUI.click(findTestObject('delete order summary/delete button'))

WebUI.click(findTestObject('delete order summary/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('delete order summary/p_The operation was successful'))

