package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class StoryPage {
    private WebDriver browser;

    public StoryPage(WebDriver browser) {
        this.browser = browser;
    }

    public StoryPage clickInButtonField() {
        browser.findElement(Locators.MainPage.BUTTON_STORY).click();
        return this;
    }
    public String getHeaderText() {
        return browser.findElement(Locators.Headers.HEADER_TEXT_STORY).getText();

    }

}