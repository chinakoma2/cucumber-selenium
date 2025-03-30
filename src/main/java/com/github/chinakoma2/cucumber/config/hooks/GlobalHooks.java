package com.github.chinakoma2.cucumber.config.hooks;

import com.github.chinakoma2.cucumber.services.SeleniumService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static com.github.chinakoma2.cucumber.utils.ReportUtils.attachScreenshotToReport;


public class GlobalHooks {

    @Autowired
    SeleniumService seleniumService;

    private final Logger logger = LoggerFactory.getLogger(GlobalHooks.class);

    /*
    ################################ Cucumber Hooks #####################################
    #####################################################################################
    |        Hook        |        When It Runs        |         Example Use Case        |
    |:------------------:|:--------------------------:|:-------------------------------:|
    | @Before            | Before each scenario       | Setup test data, login user     |
    | @After             | After each scenario        | Cleanup test data, logout user  |
    | @BeforeStep        | Before each step           | Logging, screenshots (Selenium) |
    | @AfterStep         | After each step            | Logging, debugging              |
    | @Before(order = x) | Before scenario (in order) | Control execution order         |
    | @After(order = x)  | After scenario (in order)  | Control cleanup order           |
*/

    @Before
    public void setup(Scenario scenario) {
        logger.info(" Starting Scenario: {}",scenario.getName());
        seleniumService.setUp();
    }

    @After
    public void teardown(Scenario scenario) {
        if(scenario.isFailed()){
            logger.info(" Scenario Failed: {}",scenario.getName());
            String screenshotPath = seleniumService.takeScreenshot();
            if (screenshotPath != null ) { // Attach only if the test fails
                attachScreenshotToReport(scenario, screenshotPath);
            }
        }
        else {
            logger.info(" Scenario Passed: {}",scenario.getName());
        }
        seleniumService.tearDown();
    }
}


