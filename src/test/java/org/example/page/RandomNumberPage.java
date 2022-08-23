package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//Класс для страницы RandomNumber
public class RandomNumberPage extends BasePage {

    private final By buildNumber = By.id("buildNumber");
    private final By rollDiceButton = By.id("rollDiceButton");
    private final By numberGuess = By.id("numberGuess");
    private final By submitButton = By.id("submitButton");

    private final By feedbackLabel = By.id("feedbackLabel");

    public RandomNumberPage (WebDriver driver) {
        super(driver);
        currentUrl += "random-number.html";
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void open() {
        driver.get(currentUrl);
    }


    public void chooseBuildNumber(String value) {
        new Select(driver.findElement(buildNumber)).selectByVisibleText(value);
    }

    public String getBuildNumber() {
        return new Select(driver.findElement(buildNumber)).getFirstSelectedOption().getText();
    }


    public void clickRollDiceButton() throws InterruptedException {
        driver.findElement(rollDiceButton).click();
        sleep(3000L);
    }


    public void PasteNumberGuess(String text) {
        driver.findElement(numberGuess).clear();
        driver.findElement(numberGuess).sendKeys(text);
    }

    public String getNumberGuess() {
        return driver.findElement(numberGuess).getAttribute("value");
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public String getFeedbackLabel() {
        return driver.findElement(feedbackLabel).getText();
    }
}

