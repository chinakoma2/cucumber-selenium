package com.github.chinakoma2.cucumber.services;

import com.github.chinakoma2.cucumber.utils.SeleniumPathUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
public class SeleniumService {

    WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", SeleniumPathUtil.getChromeDriverPath());
        ChromeOptions options = new ChromeOptions();
        options.setBinary(SeleniumPathUtil.getChromeBinaryPath());
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        this.driver.get(url);
    }

    public WebElement getWebElement(By by) {
        return this.driver.findElement(by);
    }

    public void typeIn(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    public void clickOn(WebElement webElement) {
        webElement.click();
    }

    public void clickOn(By by) {
        getWebElement(by).click();
    }


    public void tearDown() {
        this.driver.quit();
    }

    public void waitUntil(ExpectedCondition<Boolean> expectedCondition) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(expectedCondition);
    }

    public String takeScreenshot() {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotPath = "target/screenshots/screenshot_" + timestamp + ".png";

        try {
            File source = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
            File destination = new File(screenshotPath);
            FileUtils.copyFile(source, destination);
            return screenshotPath;
        } catch (IOException e) {
            throw new RuntimeException("Not able to take screenshot",e);
        }
    }

    public void waitFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds); // More readable & idiomatic
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted state
            throw new RuntimeException("Wait was interrupted",e);
        }
    }


}
