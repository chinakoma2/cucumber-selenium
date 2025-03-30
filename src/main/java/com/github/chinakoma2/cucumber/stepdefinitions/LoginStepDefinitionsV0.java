package com.github.chinakoma2.cucumber.stepdefinitions;

import com.github.chinakoma2.cucumber.utils.SeleniumPathUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefinitionsV0 {

    WebDriver driver;
/*
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", SeleniumPathUtil.getChromeDriverPath());
        ChromeOptions options = new ChromeOptions();
        options.setBinary(SeleniumPathUtil.getChromeBinaryPath());
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        this.driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() throws InterruptedException {
        WebElement username = this.driver.findElement(By.id("username"));
        WebElement password = this.driver.findElement(By.id("password"));
        username.sendKeys("student");
        Thread.sleep(2000);
        password.sendKeys("Password123");
        Thread.sleep(2000);
    }

    @When("clicks the login button")
    public void clicks_the_login_button() throws InterruptedException {
        this.driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";;
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }
*/
}
