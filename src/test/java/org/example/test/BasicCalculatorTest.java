package org.example.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

//Класс для тестов со страницей BasicCalculator
public class BasicCalculatorTest extends BaseTest {

    @Test
    public void testDifferenceOfTwoIntegers() {
        //Step 1
        basicCalculatorPage.open();
        Assert.assertEquals(basicCalculatorPage.getCurrentUrl(), driver.getCurrentUrl());

        //Step 2
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //Step 3
        basicCalculatorPage.chooseSelectBuild("Prototype");
        Assert.assertEquals("Prototype", basicCalculatorPage.getSelectBuild());

        //Step 4
        basicCalculatorPage.PasteNumber1Field("2");
        Assert.assertEquals("2", basicCalculatorPage.getNumber1Field());

        //Step 5
        basicCalculatorPage.PasteNumber2Field("3");
        Assert.assertEquals("3", basicCalculatorPage.getNumber2Field());

        //Step 6
        basicCalculatorPage.chooseSelectOperationDropdown("Subtract");
        Assert.assertEquals("Subtract", basicCalculatorPage.getSelectOperationDropdown());

        //Step 7
        basicCalculatorPage.clickCalculateButton();

        //Step 8
        Assert.assertEquals("-1", basicCalculatorPage.getNumberAnswerField());
    }

    @Test
    public void testConcatOfTwoStrings() {
        //Step 1
        basicCalculatorPage.open();
        Assert.assertEquals(basicCalculatorPage.getCurrentUrl(), driver.getCurrentUrl());

        //Step 2
        basicCalculatorPage.scrollToBottom();

        //Step 3
        basicCalculatorPage.chooseSelectBuild("Prototype");
        Assert.assertEquals("Prototype", basicCalculatorPage.getSelectBuild());

        //Step 4
        basicCalculatorPage.PasteNumber1Field("gs");
        Assert.assertEquals("gs", basicCalculatorPage.getNumber1Field());

        //Step 5
        basicCalculatorPage.PasteNumber2Field("bu");
        Assert.assertEquals("bu", basicCalculatorPage.getNumber2Field());

        //Step 6
        basicCalculatorPage.chooseSelectOperationDropdown("Concatenate");
        Assert.assertEquals("Concatenate", basicCalculatorPage.getSelectOperationDropdown());

        //Step 7
        basicCalculatorPage.clickCalculateButton();

        //Step 8
        Assert.assertEquals("gsbu", basicCalculatorPage.getNumberAnswerField());
    }
}

