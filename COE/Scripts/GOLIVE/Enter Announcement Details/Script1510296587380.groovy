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
//RAYCP-BRANCH-1 commit to GIT
WebUI.openBrowser('')

WebUI.navigateToUrl('https://vciaqa.rpega.com:8333/ciaqa/PRServlet/dGKN-A6ThDliXf4sywRqw74EFIEOGY6R*/!STANDARD')

WebUI.setText(findTestObject('GOLive_Objects/Page_Pega 7/input_UserIdentifier'), 'hendj@pegasystems.com')

WebUI.setText(findTestObject('GOLive_Objects/Page_Pega 7/input_Password'), 'install')

WebUI.click(findTestObject('GOLive_Objects/Page_Pega 7/button_pyActivityCode-Security'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/div_Enter Go Live'))

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('GOLive_Objects/Page_AIAManager/select_PpyWorkPagepImplementat'), 'IM-1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepPacOrgID'), 'BOFA')

WebUI.click(findTestObject('GOLive_Objects/SelectOrg'))

WebUI.delay(2)

WebUI.setText(findTestObject('GOLive_Objects/Account'), 'BOFAUK')

WebUI.click(findTestObject('GOLive_Objects/Select_Acc'))

WebUI.delay(2)

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/select_PpyWorkPagepEngagementI'))

WebUI.click(findTestObject('GOLive_Objects/Engagement'))

WebUI.setText(findTestObject('GOLive_Objects/Page_AIAManager/textarea_PpyWorkPagepComments'), 'COMMENT')

WebUI.delay(1)

WebUI.setText(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepAnnouncement'), 'Bank Of America')

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/img_inactvIcon icnHvr'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/a_14'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepIsRapidDeliv'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepIsCorporateM'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepMinorRelease'))

WebUI.selectOptionByValue(findTestObject('GOLive_Objects/Page_AIAManager/select_PpyWorkPagepDeliveryMod'), 'Pega-Led', true)

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepIsCloudImpl'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepNoAssociated'))

WebUI.scrollToElement(findTestObject('GOLive_Objects/Page_AIAManager/div_Next'), 5)

WebUI.delay(10)

WebUI.check(findTestObject('GOLive_Objects/Page_AIAManager/input_PpyWorkPagepNoAssociated'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/div_Next'))

WebUI.scrollToElement(findTestObject('GOLive_Objects/Page_AIAManager/Save_Button'), 5)

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/Save_Button'))

WebUI.click(findTestObject('GOLive_Objects/Page_AIAManager/Close_theWO'))

