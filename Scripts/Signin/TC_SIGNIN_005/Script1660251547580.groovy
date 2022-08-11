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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://services.smartbear.com/samples/TestComplete12/smartstore/')

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Login/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_First name_FirstName'), 
    'Cesar')

WebUI.setText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Last name_LastName'), 
    'Roman')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/select_Day123456789101112131415161718192021_40ab5b'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/select_Year19121913191419151916191719181919_0aafe8'), 
    '2001', true)

WebUI.setText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Email_Email'), 'croman@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Username_Username'), 
    'croman1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Password_Password'), 
    'a4ghRVpfPU4PB0XQac/vzQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Confirm password_ConfirmPassword'), 
    'a4ghRVpfPU4PB0XQac/vzQ==')

WebUI.setText(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Company name_Company'), 
    'Deloitte')

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/input_Options_Newsletter'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/p_Your registration completed'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop. Register/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop/a_croman1'))

WebUI.click(findTestObject('Object Repository/Page_MySmartStore Ecommerce/Page_Shop/a_Log out'))

WebUI.closeBrowser()

