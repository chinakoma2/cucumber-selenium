package runner;

import io.cucumber.core.cli.Main;

public class CucumberMethodRunner {
      public static void main(String[] args){
        // Define arguments programmatically, similar to a Cucumber CLI call
        String[] cucumberOptions = new String[]{
                "src/test/resources/features",
                "--glue", "com.github.chinakoma2.cucumber.stepdefinitions",
                "--glue", "com.github.chinakoma2.cucumber.config",
                "--tags", "and not @ignore",
                "--plugin", "pretty",
                "--plugin", "summary",
                "--plugin", "html:target/cucumber-reports.html"
        };

        // Run Cucumber using the CLI Main class
        int exitStatus = Main.run(cucumberOptions, Thread.currentThread().getContextClassLoader());
        if (exitStatus == 0) {
            System.out.println("Cucumber tests executed successfully!");
        } else {
            System.err.println("Cucumber tests failed with exit code: " + exitStatus);
        }
    }
}
