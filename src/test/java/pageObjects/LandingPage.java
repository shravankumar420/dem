package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement textBox(String inputText) {
		return driver.findElement(By.xpath("//*[contains(@name,'" + inputText + "')]"));
	}

	public WebElement button(String inputText) {
		return driver.findElement(By.xpath("//button[contains(@id,'" + inputText + "')]"));
	}

	public WebElement clickable(String object) {

		// return driver.findElement(By.xpath("//*[text()='"+object+"'] or
		// (//*[contains(text(),'"+object+"')])[1]"));
		return driver.findElement(By.xpath("(//*[text()='" + object + "' or contains(text(),'" + object + "')])[1]"));
	}
//public WebElement TopDeals()
//{
//	return driver.findElement(By.xpath("//a[text()='Top Deals']"));
//		
//}

//public void clearText() {
//	 driver.findElement(search).clear();
//}
//public WebElement iconClick(String iconeName) {
//	return driver.findElement(By.xpath("//*[contains(@src,'"+iconeName+"')]"));
//}
//
//public WebElement checkBox(String checkBox) {
//	return driver.findElement(By.xpath("//*[contains(@*,'"+checkBox+"')]"));
//}
//
//public WebElement textBox(String textBox) {
//	return driver.findElement(By.xpath("//*[contains(@placeholder,'"+textBox+"')]"));
//}

}