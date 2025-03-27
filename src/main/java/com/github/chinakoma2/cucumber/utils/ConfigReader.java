package com.github.chinakoma2.cucumber.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Collectors;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/test.properties");
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load test.properties file!", e);
        }
    }

    public static String getProperty(String... strings) {
        return properties.getProperty(String.join(".", strings));
    }
}
