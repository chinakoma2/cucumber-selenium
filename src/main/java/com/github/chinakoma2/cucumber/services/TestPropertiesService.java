package com.github.chinakoma2.cucumber.services;

import com.github.chinakoma2.cucumber.bean.LoginLocators;
import com.github.chinakoma2.cucumber.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.springframework.stereotype.Service;

import static com.github.chinakoma2.cucumber.consts.SeleniumPropsConst.*;

@Service
public class TestPropertiesService {


    public String getBaseUrl() {
        return ConfigReader.getProperty(BASE, URL);
    }

    public String getLoginUrl() {
        return getBaseUrl().concat(ConfigReader.getProperty(LOGIN, URL));
    }

    public String getHomeUrl() {
        return getBaseUrl().concat(ConfigReader.getProperty(HOME, URL));
    }

    public UsernameAndPassword getValidCredentials() {
        return new UsernameAndPassword(ConfigReader.getProperty(VALID, LOGIN, USERNAME),
                ConfigReader.getProperty(VALID, LOGIN, PASSWORD));
    }

    public UsernameAndPassword getCredentials(String name) {
        return new UsernameAndPassword(ConfigReader.getProperty(name, LOGIN, USERNAME),
                ConfigReader.getProperty(name, LOGIN, PASSWORD));
    }

    public LoginLocators getLoginLocators() {
        LoginLocators loginLocators = new LoginLocators();
        loginLocators.setUsernameField(By.xpath(ConfigReader.getProperty(LOGIN, LOCATOR, USERNAME)));
        loginLocators.setPasswordField(By.xpath(ConfigReader.getProperty(LOGIN, LOCATOR, PASSWORD)));
        loginLocators.setLoginButton(By.xpath(ConfigReader.getProperty(LOGIN, LOCATOR, SIGN_IN)));
        return loginLocators;
    }

}
