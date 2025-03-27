package com.github.chinakoma2.cucumber.utils;

import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReportUtils {

    public static void attachScreenshotToReport(Scenario scenario, String screenshotPath) {
        try {
            File screenshotFile = new File(screenshotPath);
            byte[] fileContent = Files.readAllBytes(screenshotFile.toPath());
            scenario.attach(fileContent, "image/png", "Screenshot");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
