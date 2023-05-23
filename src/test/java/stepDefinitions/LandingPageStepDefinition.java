package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public String productName;
	public LandingPage landingpage;
	TestContextSetup testcontextsetup;

	public LandingPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		landingpage = testcontextsetup.pageObjectmanager.getlandingPage();
	}

	@Given("user enter {string} text into {string}")
	public void user_enter_text_into(String value, String path) {
		landingpage.textBox(path).clear();
		landingpage.textBox(path).sendKeys(value);
	}

	@When("user click on {string}")
	public void user_click_on_something(String object) throws InterruptedException {
		landingpage.clickable(object).click();
	}

	@When("user click on {string} button")
	public void user_click_on_button(String object) throws InterruptedException {
		landingpage.button(object).click();
	}
}
