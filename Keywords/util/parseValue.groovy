package util
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class parseValue {

	@Keyword
	public void parseAValueToWebObject(TestObject to, String text ) {

		WebElement element = WebUiBuiltInKeywords.findWebElement(to);

		WebUI.executeJavaScript("arguments[0].value='" + text + "'", Arrays.asList(element))
	}
}
