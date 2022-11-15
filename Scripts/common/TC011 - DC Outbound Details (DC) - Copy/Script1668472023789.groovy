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
        , ('verification') : GlobalVariable.verificationAzwan, ('company') : GlobalVariable.sgttapdc], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC011/Page_Brivge/button_Logistics'))

WebUI.click(findTestObject('TC011/Page_Brivge/li_Outbound Monitoring List'))

WebUI.click(findTestObject('TC011/Outbound Monitoring List/button_Create'))

WebUI.scrollToElement(findTestObject('TC011/Verify and Input Basic Info/div_2'), 0)

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/input__buyer'))

WebUI.setText(findTestObject('TC011/Verify and Input Basic Info/input__buyer'), 'VN-TTVN')

WebUI.sendKeys(findTestObject('TC011/Verify and Input Basic Info/input__buyer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/input__receiver'))

WebUI.setText(findTestObject('TC011/Verify and Input Basic Info/input__receiver'), 'VN-TTVN')

WebUI.sendKeys(findTestObject('TC011/Verify and Input Basic Info/input__receiver'), Keys.chord(Keys.ENTER))

y = CustomKeywords.'util.generateTime.dateTimeGenerator'()

String outboundRefDC = "o-" + y;

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/input__outboundRefNo'))

WebUI.setText(findTestObject('TC011/Verify and Input Basic Info/input__outboundRefNo'), 'O-test11112022')

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/input__etd'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/button_13'))

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/input__eta'))

WebUI.click(findTestObject('TC011/Verify and Input Basic Info/button_20'))

WebUI.scrollToElement(findTestObject('TC011/Container1/div_Container 1'), 0)

WebUI.click(findTestObject('TC011/Container1/input_Type of Containers'))

WebUI.setText(findTestObject('TC011/Container1/input_Type of Containers'), '20FT')

WebUI.sendKeys(findTestObject('TC011/Container1/input_Type of Containers'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC011/Container1/input_Type of Commodities'))

WebUI.setText(findTestObject('TC011/Container1/input_Type of Commodities'), 'C-TYPR1')

WebUI.sendKeys(findTestObject('TC011/Container1/input_Type of Commodities'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC011/Container1/input_Container No'))

WebUI.setText(findTestObject('TC011/Container1/input_Container No'), 'C-09112022')

WebUI.click(findTestObject('TC011/Container1/input_Seal No'))

WebUI.setText(findTestObject('TC011/Container1/input_Seal No'), 'S-09112022')

WebUI.click(findTestObject('TC011/Container1/input_Container M3'))

WebUI.setText(findTestObject('TC011/Container1/input_Container M3'), '1000.001')

WebUI.click(findTestObject('TC011/Container1/input_Container NetWeight'))

WebUI.setText(findTestObject('TC011/Container1/input_Container NetWeight'), '1000.001')

WebUI.click(findTestObject('TC011/Container1/input_Container GrossWeight'))

WebUI.setText(findTestObject('TC011/Container1/input_Container GrossWeight'), '1000.001')

WebUI.click(findTestObject('TC011/Outer Package/button_ADD OUTER PACKAGE'))

WebUI.scrollToElement(findTestObject('TC011/Outer Package/button_ADD OUTER PACKAGE'), 0)

WebUI.click(findTestObject('TC011/Outer Package/input_Outer Package No'))

WebUI.setText(findTestObject('TC011/Outer Package/input_Outer Package No'), 'O-11112022')

WebUI.click(findTestObject('TC011/Outer Package/input_OuterPackageType'))

WebUI.setText(findTestObject('TC011/Outer Package/input_OuterPackageType'), 'CARTONBOX')

WebUI.sendKeys(findTestObject('TC011/Outer Package/input_OuterPackageType'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC011/Outer Package/input_Package M3'))

WebUI.setText(findTestObject('TC011/Outer Package/input_Package M3'), '20')

WebUI.click(findTestObject('TC011/Outer Package/input_Outer Package NetWeight'))

WebUI.setText(findTestObject('TC011/Outer Package/input_Outer Package NetWeight'), '15')

WebUI.click(findTestObject('TC011/Outer Package/input_Outer Package GrossWeight'))

WebUI.setText(findTestObject('TC011/Outer Package/input_Outer Package GrossWeight'), '21')

WebUI.click(findTestObject('TC011/Add Part/button_ADD PARTS'))

WebUI.click(findTestObject('TC011/Inner Parts List/input_Inner Parts List'))

WebUI.setText(findTestObject('TC011/Inner Parts List/input_Inner Parts List'), 's110310-2211001')

WebUI.check(findTestObject('TC011/Inner Parts List/input_AND_lcbm-lcbm335'))

WebUI.check(findTestObject('TC011/Inner Parts List/input_AND_lcbm-lcbm409'))

WebUI.click(findTestObject('TC011/Inner Parts List/button_OK'))

WebUI.click(findTestObject('TC011/Add Part/input_ADD PARTS_Qty1'))

WebUI.setText(findTestObject('TC011/Add Part/input_ADD PARTS_Qty1'), '1000')

WebUI.click(findTestObject('TC011/Add Part/input_ADD PARTS_Qty2'))

WebUI.setText(findTestObject('TC011/Add Part/input_ADD PARTS_Qty2'), '1000')

WebUI.click(findTestObject('TC011/button_Submit'))

WebUI.click(findTestObject('TC011/button_CONFIRM'))

