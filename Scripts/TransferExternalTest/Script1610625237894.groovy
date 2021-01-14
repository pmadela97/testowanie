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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('LoginPage/login_field'), login_id)

WebUI.click(findTestObject('LoginPage/next_button'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('LoginPage/password_field'), password_enc)

WebUI.click(findTestObject('LoginPage/sign_in_button'))

WebUI.delay(1)
WebUI.click(findTestObject('DesktopPage/transfer_link'))
WebUI.delay(2)
WebUI.setText(findTestObject('TransferPage/receiver_name_field'), name )

WebUI.setText(findTestObject('TransferPage/receiver_account_field'), account_num)

WebUI.setText(findTestObject('TransferPage/amount_field'), amount)

WebUI.setText(findTestObject('TransferPage/title_field'), title)

WebUI.click(findTestObject('TransferPage/next_button'))

WebUI.verifyElementText(findTestObject('TransferPage/money_label'), '13 159,20')

WebUI.closeBrowser()

