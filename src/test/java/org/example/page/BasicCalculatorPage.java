package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//Класс для страница BasicCalculator
public class BasicCalculatorPage extends BasePage {
    private final By selectBuild = By.id("selectBuild");
    private final By number1Field = By.id("number1Field");
    private final By number2Field = By.id("number2Field");
    private final By selectOperationDropdown = By.id("selectOperationDropdown");
    private final By calculateButton = By.id("calculateButton");
    private final By numberAnswerField = By.id("numberAnswerField");

    public BasicCalculatorPage(WebDriver driver) {
        super(driver);
        currentUrl += "BasicCalculator.html";
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void open() {
        driver.get(currentUrl);
    }


    public void chooseSelectBuild(String value) {
        new Select(driver.findElement(selectBuild)).selectByVisibleText(value);
    }

    public String getSelectBuild() {
        return new Select(driver.findElement(selectBuild)).getFirstSelectedOption().getText();
    }


    public void PasteNumber1Field(String text) {
        driver.findElement(number1Field).clear();
        driver.findElement(number1Field).sendKeys(text);
    }

    public String getNumber1Field() {
        return driver.findElement(number1Field).getAttribute("value");
    }


    public void PasteNumber2Field(String text) {
        driver.findElement(number2Field).clear();
        driver.findElement(number2Field).sendKeys(text);
    }

    public String getNumber2Field() {
        return driver.findElement(number2Field).getAttribute("value");
    }


    public void chooseSelectOperationDropdown(String value) {
        new Select(driver.findElement(selectOperationDropdown)).selectByVisibleText(value);
    }

    public String getSelectOperationDropdown() {
        return new Select(driver.findElement(selectOperationDropdown)).getFirstSelectedOption().getText();
    }


    public void clickCalculateButton() {
        driver.findElement(calculateButton).click();
    }


    public String getNumberAnswerField() {
        return driver.findElement(numberAnswerField).getAttribute("value");
    }

}

