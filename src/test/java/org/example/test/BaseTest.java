package org.example.test;

import org.example.page.BasicCalculatorPage;
import org.example.page.RandomNumberPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

//Родительский файл для тестов
public class BaseTest {

    protected WebDriver driver;
    protected BasicCalculatorPage basicCalculatorPage;
    protected RandomNumberPage randomNumberPage;


    @Before
    public void prepare() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        basicCalculatorPage = new BasicCalculatorPage(driver);
        randomNumberPage = new RandomNumberPage(driver);
    }

    @After
    public void teardown() throws IOException {
        //driver.quit();
    }
}

