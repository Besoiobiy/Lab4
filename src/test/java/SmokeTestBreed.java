import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.BreedPage;

public class SmokeTestBreed {

    private WebDriver browser;

    @Before
    public void precondition() {

        browser = new EdgeDriver();
        browser.manage().window().maximize();
        browser.get("https://mrkot.com/");
    }

    @Test
    public void checkSiteSearcher() {
        BreedPage breedPage = new BreedPage(browser);

        String headerText = breedPage
                .clickInButtonField()
                .getHeaderText();
        String assertionError = null;
        try {
            Assert.assertEquals(headerText,"ПОРОДЫ >");
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