import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CarePage;

public class SmokeTestCare {

    private WebDriver browser;

    @Before
    public void precondition() {

        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://mrkot.com/");
    }

    @Test
    public void checkSiteSearcher() {
        CarePage carePage = new CarePage(browser);

        String headerText = carePage
                .clickInButtonField()
                .getHeaderText();
        String assertionError = null;
        try {
            Assert.assertEquals(headerText,"Уход за кошками");
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