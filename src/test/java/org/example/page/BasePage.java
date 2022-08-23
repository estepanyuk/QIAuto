package org.example.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

//Родительский класс для всех страниц
public class BasePage {
    protected final WebDriver driver;
    protected String currentUrl = "https://testsheepnz.github.io/";

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void scrollToBottom() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ignored) {
        }
    }
}

