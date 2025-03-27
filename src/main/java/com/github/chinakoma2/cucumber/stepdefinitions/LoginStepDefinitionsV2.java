package com.github.chinakoma2.cucumber.stepdefinitions;

import com.github.chinakoma2.cucumber.services.SeleniumService;
import com.github.chinakoma2.cucumber.services.TestPropertiesService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;


public class LoginStepDefinitionsV2 {
/*
    @Autowired
    SeleniumService seleniumService;

    @Autowired
    TestPropertiesService testPropertiesService;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        seleniumService.navigateTo(testPropertiesService.getLoginUrl());
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        WebElement username = seleniumService.getWebElement(By.xpath("(//input)[1]"));
        WebElement password = seleniumService.getWebElement(By.xpath("(//input)[2]"));
        seleniumService.typeIn(username, testPropertiesService.getValidCredentials().username());
        seleniumService.waitFor(2);
        seleniumService.typeIn(password, testPropertiesService.getValidCredentials().password());
        seleniumService.waitFor(2);
    }


    @When("clicks the login button")
    public void clicks_the_login_button() {
        seleniumService.clickOn(By.xpath("//button[@id='submit' or @type='submit']"));
        seleniumService.waitFor(2);
    }


    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        seleniumService.waitUntil(ExpectedConditions.urlToBe(testPropertiesService.getHomeUrl()));
    }

*/
}