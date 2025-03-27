package com.github.chinakoma2.cucumber.bean;

import org.openqa.selenium.By;

public class LoginLocators {
    private By usernameField;
    private By passwordField;
    private By loginButton;

    public LoginLocators() {
    }


    public By getUsernameField() {
        return usernameField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getLoginButton() {
        return loginButton;
    }


    public void setUsernameField(By usernameField) {
        this.usernameField = usernameField;
    }

    public void setPasswordField(By passwordField) {
        this.passwordField = passwordField;
    }

    public void setLoginButton(By loginButton) {
        this.loginButton = loginButton;
    }
}
