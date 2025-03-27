package com.github.chinakoma2.cucumber.stepdefinitions;

import com.github.chinakoma2.cucumber.bean.LoginLocators;
import com.github.chinakoma2.cucumber.services.SeleniumService;
import com.github.chinakoma2.cucumber.services.TestPropertiesService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;


public class LoginStepDefinitionsV3 {
/*
    @Autowired
    SeleniumService seleniumService;

    @Autowired
    TestPropertiesService testPropertiesService;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        seleniumService.navigateTo(testPropertiesService.getLoginUrl());
    }

    @When("the user enters {credentialsName} username and password")
    public void the_user_enters_username_and_password(String credentialsName) {
        LoginLocators loginLocators= testPropertiesService.getLoginLocators();
        UsernameAndPassword credentials = testPropertiesService.getCredentials(credentialsName);

        WebElement username = seleniumService.getWebElement(loginLocators.getUsernameField());
        WebElement password = seleniumService.getWebElement(loginLocators.getPasswordField());

        seleniumService.typeIn(username, credentials.username());
        seleniumService.waitFor(2);
        seleniumService.typeIn(password, credentials.password());
        seleniumService.waitFor(2);
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        seleniumService.clickOn(testPropertiesService.getLoginLocators().getLoginButton());
        seleniumService.waitFor(2);
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        seleniumService.waitUntil(ExpectedConditions.urlToBe(testPropertiesService.getHomeUrl()));
    }
*/

}