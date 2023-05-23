package pageObjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPage {

	public WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement headername(String path) {

		return driver.findElement(By.xpath("//h1[contains(text(),'" + path + "')]"));
	}

	public WebElement learnMoreAbout(String section, String name) {
		return driver.findElement(By.xpath("//*[contains(text(),'Learn more about')]/a[contains(text(),'" + section
				+ "')]//following::*[text()='" + name + "']"));
	}

	public WebElement select(String name) {
		if (name.contains(" ")) {
			String before = name.split(" ")[0];
			String lowerafter = name.split(" ")[1];
			String capafter = StringUtils.capitalize(lowerafter);
			return driver.findElement(
					By.xpath("//*[text()='" + name + "']/following::*[@id='Search" + before + capafter + "Id']"));
		} else {
			return driver.findElement(By.xpath("//*[text()='" + name + "']/following::*[@id='Search" + name + "Id']"));
		}

	}

}
