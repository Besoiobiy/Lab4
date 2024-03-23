package utils;

import org.openqa.selenium.By;

import java.security.PublicKey;

public interface Locators {

    public interface MainPage {
        By BUTTON_BREED = By.xpath("(//a[contains(text(),'ПОРОДЫ >')])[1]");
        By BUTTON_DOG = By.xpath("(//a[contains(text(),'СОБАКИ >')])[1]");
        By BUTTON_VOTE_CHOICE = By.xpath("(//label[@class='dem__checkbox_label'])[1]");
        By BUTTON_VOTE_SEND = By.xpath("(//input[@value='Голосовать'])[1]");
        By BUTTON_VOTE_REVOTE = By.xpath("(//input[@value='Переголосовать'])[1]");
        By BUTTON_SHELTER = By.xpath("(//a[contains(text(),'ПРИЮТЫ >')])[1]");
        By BUTTON_CARE = By.xpath("(//a[contains(text(),'УХОД >')])[1]");
        By BUTTON_STORY = By.xpath("(//a[contains(text(),'ИСТОРИИ >')])[1]");

    }

    public interface Headers {
        By HEADER_TEXT_BREED = By.xpath("(//span[@class='removed-link'][contains(text(),'ПОРОДЫ >')])[1]");
        By HEADER_TEXT_DOG = By.xpath("(//h1[contains(text(),'Собаки')])[1]");
        By HEADER_VOTE_RESULT = By.xpath("(//a[@class='dem-link dem-results-link'][contains(text(),'Результаты')])[1]");
        By HEADER_TEXT_CARE = By.xpath("(//h1[contains(text(),'Уход за кошками')])[1]");
        By HEADER_TEXT_STORY = By.xpath("(//h1[contains(text(),'Истории')])[1]");

    }

}