package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class CarePage {
    private WebDriver browser;

    public CarePage(WebDriver browser) {
        this.browser = browser;
    }

    public CarePage clickInButtonField() {
        browser.findElement(Locators.MainPage.BUTTON_CARE).click();
        return this;
    }
    public String getHeaderText() {
        return browser.findElement(Locators.Headers.HEADER_TEXT_CARE).getText();

    }

}