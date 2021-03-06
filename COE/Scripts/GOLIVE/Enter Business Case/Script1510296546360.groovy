import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vciaqa.rpega.com:8333/ciaqa/PRServlet/dGKN-A6ThDliXf4sywRqw74EFIEOGY6R*/!STANDARD')

WebUI.setText(findTestObject('GOLive_Objects/Search/Page_Pega 7/input_UserIdentifier'), 'hendj@pegasystems.com')

WebUI.setText(findTestObject('GOLive_Objects/Search/Page_Pega 7/input_Password'), 'install')

WebUI.sendKeys(findTestObject('GOLive_Objects/Search/Page_Pega 7/input_Password'), Keys.chord(Keys.ENTER))

WebUI.maximizeWindow()

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/span_Advanced Search'))

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/label_Go Live'))

WebUI.setText(findTestObject('GOLive_Objects/Search/Page_AIAManager/input_PpyDisplayHarnesspSearch'), GlobalVariable.AIAWOID)

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Search'))

WebUI.doubleClick(findTestObject('GOLive_Objects/Search/Page_AIAManager/span_OGL-1608'))

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/Enter Business Case'))

WebUI.scrollToElement(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'), 5)

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'))

