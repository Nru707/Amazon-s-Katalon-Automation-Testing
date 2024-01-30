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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/Amazon_delete_item_from_cart_TC005/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'chemistry book')

WebUI.click(findTestObject('Object Repository/Amazon_delete_item_from_cart_TC005/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_delete_item_from_cart_TC005/Page_Amazon.com  chemistry book/span_Chemistry Made Easy An Illustrated Stu_153de6'))

WebUI.click(findTestObject('Amazon_add_to_cart_TC004/Page_Amazon.com AP Chemistry Premium, 2024 _35f007/input_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Amazon_delete_item_from_cart_TC005/Page_Amazon.com Shopping Cart/a_Go to Cart'))

WebUI.click(findTestObject('Object Repository/Amazon_delete_item_from_cart_TC005/Page_Amazon.com Shopping Cart/input_submit.delete.8bc2c0f9-b1cf-4a72-854f_3b8889'))

WebUI.closeBrowser()

