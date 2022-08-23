package org.example.test;

import org.junit.Assert;
import org.junit.Test;

public class RandomNumberTest extends BaseTest {
    @Test
    public void testRandomNumber() throws InterruptedException {
        //Step 1
        randomNumberPage.open();
        Assert.assertEquals(randomNumberPage.getCurrentUrl(), driver.getCurrentUrl());

        //Step 2
        randomNumberPage.scrollToBottom();

        //Step 3
        randomNumberPage.chooseBuildNumber("Demo");
        Assert.assertEquals("Demo", randomNumberPage.getBuildNumber());

        //Step 4
        randomNumberPage.clickRollDiceButton();

        //Step 5
        randomNumberPage.PasteNumberGuess("string");
        Assert.assertEquals("string", randomNumberPage.getNumberGuess());

        //Step 6
        randomNumberPage.clickSubmitButton();

        //Step 7
        Assert.assertEquals("string: Not a number!", randomNumberPage.getFeedbackLabel());
    }
}

