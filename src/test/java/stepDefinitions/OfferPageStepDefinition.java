package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	public WebDriver driver;
	public OfferPage offerPage;
	// public String productName;
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectmanager;

	public OfferPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		offerPage = testcontextsetup.pageObjectmanager.getofferPage();
	}

	@Then("assert {string} is displayed in header")
	public void assert_is_displayed_in_header(String value) {

		String actualValue = offerPage.headername(value).getText();
		System.out.println(actualValue);
		assertEquals(value, actualValue);

	}

	@Then("assert {string} is displayed in section Learn more about {string}")
	public void assert_is_displayed_in_section_Learn_more_about(String name, String section) {

		String actualValue = offerPage.learnMoreAbout(section, name).getText();
		assertEquals(name, actualValue);
	}

	@When("user click on {string} dropdown")
	public void user_click_on_something(String object) throws InterruptedException {
		offerPage.select(object).click();
	}

	@Then("user search for {string} shortname in offer page to check if products exist {string}")
	public void user_search_for_shortname_in_offer_page_to_check_if_products_exist(String name, String path)
			throws InterruptedException {
		// pageObjectmanager=new PageObjectManager(testcontextsetup.driver);
		// OfferPage offerPage=testcontextsetup.pageObjectmanager.getofferPage();
		// OfferPage offerPage=new OfferPage(testcontextsetup.driver);
//	   Set<String> s1=testcontextsetup.driver.getWindowHandles();
//	   Iterator<String> i1=s1.iterator();
//	   String parentwindow=i1.next();
//	   String childwindow=i1.next();
//	   testcontextsetup.driver.switchTo().window(childwindow); 
		testcontextsetup.genericUtils.SwitchWindowToChild();
		// offerPage.search(path).sendKeys(name);
		Thread.sleep(3000);
		// String offerpageveg= offerPage.tableData(name).getText();
		// System.out.println(offerpageveg);
		// System.out.println(testcontextsetup.productName);
		// Assert.assertEquals(offerpageveg, testcontextsetup.productName);

	}

	@Then("^user search for (.+) shortname in offer page to check if products exist \"([^\"]*)\" exp$")
	public void user_search_for_shortname_in_offer_page_to_check_if_products_exist_something_exp(String names,
			String path) throws Throwable {
		OfferPage offerPage = testcontextsetup.pageObjectmanager.getofferPage();
		testcontextsetup.genericUtils.SwitchWindowToChild();
		// offerPage.search(path).sendKeys(names);
//		   Thread.sleep(3000);
//		  String offerpageveg= offerPage.tableData(names).getText();
//		  System.out.println(offerpageveg);
//		  System.out.println(testcontextsetup.productName);
	}

}
