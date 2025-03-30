package com.github.chinakoma2.cucumber.utils;


public class SeleniumPathUtil {

    private static final String BASE_PATH = System.getProperty("user.dir") + "/target/selenium-resources/";

    public static String getChromeDriverPath() {
        return BASE_PATH + "drivers/chromedriver.exe";
    }

    public static String getChromeBinaryPath() {
        return BASE_PATH + "browsers/chrome/chrome.exe";
    }
}


