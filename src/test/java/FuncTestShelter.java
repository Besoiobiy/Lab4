import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ShelterPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FuncTestShelter {

    private WebDriver browser;

    @Before
    public void precondition() {

        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://mrkot.com/");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void checkSiteSearcher() {
        ShelterPage shelterPage = new ShelterPage(browser);
        //WebDriverWait wait = new WebDriverWait(browser,10);
        String headerText = shelterPage
                .clickShelterButton()
                .clickYourChoiceButton()
                .clickVoteSendButton()
               // .withTimeout(Duration.ofSeconds(4))
                .clickReVoteButton()
               // .withTimeout(Duration.ofSeconds(4))
                .clickOKButton()
                .getHeaderText();
        String assertionError = null;
        try {
            Assert.assertEquals(headerText,"Результаты");
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }

        if (assertionError != null) {
            System.out.println(assertionError);
        }
        else {
            System.out.println("Тестирование прошло успешно");
        }
    }




    @After
    public void postCondition() {
        browser.quit();

    }

}