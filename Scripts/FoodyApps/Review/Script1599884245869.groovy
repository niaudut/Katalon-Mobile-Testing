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

Mobile.tap(findTestObject('FoodyApps/Btn_Review'), 0)

if (Mobile.verifyElementExist(findTestObject('FoodyApps/Btn_Yes_Review'), 1, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('FoodyApps/Btn_Yes_Review'), 0)
}

Mobile.clearText(findTestObject('FoodyApps/Txt_Title_Review'), 0)

def TitleReview = 'Taste'

def Explenation = 'This is my favorite.'

Mobile.setText(findTestObject('FoodyApps/Txt_Title_Review'), TitleReview, 0)

Mobile.setText(findTestObject('FoodyApps/Txt_Explanation_Review'), Explenation, 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Post_Review'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Rate_Review'), 0)

Mobile.setSliderValue(findTestObject('FoodyApps/Btn_Rating_Location'), 90, 0)

Mobile.setSliderValue(findTestObject('FoodyApps/Btn_Rating_Price'), 90, 0)

Mobile.setSliderValue(findTestObject('FoodyApps/Btn_Rating_Quality'), 90, 0)

Mobile.setSliderValue(findTestObject('FoodyApps/Btn_Rating_Service'), 90, 0)

Mobile.setSliderValue(findTestObject('FoodyApps/Btn_Rating_Decoration'), 90, 0)

Mobile.tap(findTestObject('FoodyApps/Btn_No_Person'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_8'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Expense'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_500ribu'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Come_Back'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Sure'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Done_Rate'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Post_Review'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Close_Notif_Point'), 0)

def actualTitleReview = Mobile.getText(findTestObject('FoodyApps/Ttl_Title_Review'), 0)

Mobile.verifyMatch(actualTitleReview, TitleReview, false)

def actualExplanationReview = Mobile.getText(findTestObject('FoodyApps/Ttl_Explanation_Review'), 0)

Mobile.verifyMatch(actualExplanationReview, Explenation, false)

def actualLikeReview = Mobile.getText(findTestObject('FoodyApps/Ttl_Like_Review'), 0)

Mobile.verifyMatch(actualLikeReview, 'Like', false)

Mobile.tap(findTestObject('FoodyApps/Btn_Burger_Review'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Delete_Review'), 0)

Mobile.tap(findTestObject('FoodyApps/Btn_Yes_Delete_Review'), 0)

Mobile.verifyElementExist(findTestObject('FoodyApps/Ttl_Bello_Coffee'), 0)

