import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is at login page (.*)")
	def NavigateToLoginPage(String url) {
		
		WebUI.openBrowser(url)
		WebUI.click(findTestObject('LoginFunctionality_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Hello, Sign in  Account  Lists        Account'))

	}

	@When("User enters (.*) and (.*)")
	def EnterLoginData(String username, String password) {
		WebUI.setText(findTestObject('LoginFunctionality_OR/Page_Amazon Sign In/input_Email or mobile phone number_email'), username)
		
		WebUI.click(findTestObject('LoginFunctionality_OR/Page_Amazon Sign In/input_Enter your email or mobile phone number_continue'))
		
		WebUI.setText(findTestObject('LoginFunctionality_OR/Page_Amazon Sign In/input_Forgot Password_password'), password)
		
	}

	@And("Click on 'Submit' button")
	def clickOnSubmitbutton()
	{
		WebUI.click(findTestObject('LoginFunctionality_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))
	}
	
	@Then("Home page should be displayed")
	def VerifyHomePage() {
		WebUI.verifyTextPresent('Hello, lalitha', false)
	}
}