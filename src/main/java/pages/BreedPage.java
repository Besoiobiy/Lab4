package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class BreedPage {
    private WebDriver browser;

    public BreedPage(WebDriver browser) {
        this.browser = browser;
    }

      public BreedPage clickInButtonField() {
        browser.findElement(Locators.MainPage.BUTTON_BREED).click();
        return this;
    }
    public String getHeaderText() {
        return browser.findElement(Locators.Headers.HEADER_TEXT_BREED).getText();

    }

}