package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object usernameLuqman
     
    /**
     * <p></p>
     */
    public static Object passwordLuqman
     
    /**
     * <p></p>
     */
    public static Object verificationLuqman
     
    /**
     * <p></p>
     */
    public static Object usernameAzwan
     
    /**
     * <p></p>
     */
    public static Object passwordAzwan
     
    /**
     * <p></p>
     */
    public static Object verificationAzwan
     
    /**
     * <p></p>
     */
    public static Object vnttvn
     
    /**
     * <p></p>
     */
    public static Object sgttap
     
    /**
     * <p></p>
     */
    public static Object sgbafco
     
    /**
     * <p></p>
     */
    public static Object sgttapdc
     
    /**
     * <p></p>
     */
    public static Object custContractNo
     
    /**
     * <p></p>
     */
    public static Object supplContractNo
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            usernameLuqman = selectedVariables['usernameLuqman']
            passwordLuqman = selectedVariables['passwordLuqman']
            verificationLuqman = selectedVariables['verificationLuqman']
            usernameAzwan = selectedVariables['usernameAzwan']
            passwordAzwan = selectedVariables['passwordAzwan']
            verificationAzwan = selectedVariables['verificationAzwan']
            vnttvn = selectedVariables['vnttvn']
            sgttap = selectedVariables['sgttap']
            sgbafco = selectedVariables['sgbafco']
            sgttapdc = selectedVariables['sgttapdc']
            custContractNo = selectedVariables['custContractNo']
            supplContractNo = selectedVariables['supplContractNo']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
