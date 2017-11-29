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


//ESU   ranjs1 branch -2

WebUI.click(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/span_Advanced Search (1)'))

WebUI.selectOptionByValue(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/select_PpyWorkPagepSrchCaseTyp'), 
    'Clinic Request', true)

WebUI.sendKeys(findTestObject('Methods_Pooja/CaseID'), 'ECR-06Nov2017-35')

WebUI.selectOptionByValue(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/select_PpyWorkPagepSrchStatus'), 
    'Pending-Clinic', true)

WebUI.click(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/img_inactvIcon icnHvr'))

WebUI.click(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/a_1'))

WebUI.click(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/button_Search'))

WebUI.comment('Advanced Search functionality passed')

WebUI.doubleClick(findTestObject('Methods_Pooja/Page_The Consulting Portal (TCP) (1)/ECRWO'))

WebUI.click(findTestObject('Methods_Pooja/Actions'))

result = WebUI.getText(findTestObject('Methods_Pooja/Actions'))

