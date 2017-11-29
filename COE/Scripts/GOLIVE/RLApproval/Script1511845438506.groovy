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

WebUI.click(findTestObject('GOLive_Objects/PRApprove/Page_AIAManager/PRApprove'))

WebUI.click(findTestObject('GOLive_Objects/PreviewEmail/Page_AIAManager/div_Preview Pdf'))

WebUI.delay(5)

WebUI.click(findTestObject('GOLive_Objects/PreviewEmail/Page_AIAManager/div_Preview Email'))

WebUI.delay(5)

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/RLApproval'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/ReviewGoLive_RL'))

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('GOLIVE/Preview Email'), [:], FailureHandling.STOP_ON_FAILURE)

