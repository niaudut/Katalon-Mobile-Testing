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

Mobile.tap(findTestObject('FoodyApps/Btn_Profile'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Login'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Connect_with_FB'), 0)

Mobile.setText(findTestObject('FoodyApps/Txt_Email_FB'), 'niamariana313@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('FoodyApps/Txt_Password_FB'), 'i+85kCaagqbQdIz+oOWJ0w==', 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Login_FB'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('FoodyApps/Btn_Continue_as_Nia'), 0)
Mobile.verifyElementExist(findTestObject('FoodyApps/Ttl_Nia'), 0)

