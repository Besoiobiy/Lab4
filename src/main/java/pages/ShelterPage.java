package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ShelterPage {
    private WebDriver browser;

    public ShelterPage(WebDriver browser) {
        this.browser = browser;
    }

    public ShelterPage clickYourChoiceButton() {
        browser.findElement(Locators.MainPage.BUTTON_VOTE_CHOICE).click();
        return this;
    }
    public ShelterPage clickVoteSendButton() {
        browser.findElement(Locators.MainPage.BUTTON_VOTE_SEND).click();
        return this;
    }
    public ShelterPage clickReVoteButton() {
        browser.findElement(Locators.MainPage.BUTTON_VOTE_REVOTE).click();
        return this;
    }
    public ShelterPage clickOKButton() {
        //browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alerts2 = browser.switchTo().alert();
        System.out.println(((Alert) alerts2).getText());
        alerts2.accept();
        return this;
    }
    public ShelterPage clickShelterButton() {
        browser.findElement(Locators.MainPage.BUTTON_SHELTER).click();
        return this;
    }

    public String getHeaderText() {
        return browser.findElement(Locators.Headers.HEADER_VOTE_RESULT).getText();

    }

    public ShelterPage withTimeout(Duration ofSeconds) {
        // browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        return this;
    }
    public ShelterPage specWait(Duration ofSeconds) {
        //browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        return this;
    }
}