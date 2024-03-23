package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class DogPage {
    private WebDriver browser;

    public DogPage(WebDriver browser) {
        this.browser = browser;
    }

    public DogPage clickInButtonField() {
        browser.findElement(Locators.MainPage.BUTTON_DOG).click();
        return this;
    }
    public String getHeaderText() {
        return browser.findElement(Locators.Headers.HEADER_TEXT_DOG).getText();

    }

}