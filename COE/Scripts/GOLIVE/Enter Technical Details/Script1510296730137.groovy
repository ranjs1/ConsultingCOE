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

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepSolutionMap'), 
    'Ind5', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepSolutionMap (1)'), 
    'IndSeg25', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepSolutionMap (2)'), 
    'IndSol439', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepImplementat'), 
    'Industry Specific', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/SolutionMap1'), 'FS - Cards', 
    true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepImplementat (1)'), 
    'less than 500', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepChannelsl1p'), 
    'N/A', true)

WebUI.delay(2)

WebUI.setText(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/input_PpyWorkPagepCustomerCont'), 
    'test')

WebUI.delay(1)

WebUI.setText(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/input_PpyWorkPagepCustomerCont (1)'), 
    'test')

WebUI.delay(1)

WebUI.setText(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/input_PpyWorkPagepCustomerCont (2)'), 
    'test@gmail.com')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepAppServerNa'), 
    5)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepAppServerNa'), 
    'Apache Server', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepAppServerOS'), 
    'Mainframe', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepDBServerNam'), 
    'RMS', true)

WebUI.delay(2)

WebUI.click(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepProductsl1p'))

WebUI.click(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/Product_Name'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Update Technical Details/Page_AIAManager/select_PpyWorkPagepProductsl1p (1)'), 
    'RLS-3596', true)

WebUI.scrollToElement(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'), 5)

WebUI.click(findTestObject('GOLive_Objects/Search/Page_AIAManager/div_Next'))

WebUI.delay(5)

