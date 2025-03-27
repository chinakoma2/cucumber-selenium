package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.github.chinakoma2.cucumber.stepdefinitions","com.github.chinakoma2.cucumber.config"},
        tags = "@login and not @ignore",
        plugin = {"pretty", "summary", "html:target/cucumber-reports.html"}
)
public class CucumberTestRunner {

    /*
    🚀 Cucumber Options – Explained
    --------------------------------

    @CucumberOptions(
        features = "src/test/resources/features",  // Path to feature files
        glue = {"com.example.cucumber.steps"},    // Package with step definitions
        plugin = {
            "pretty",                // Prints Cucumber output in a readable format
            "html:target/cucumber-reports.html", // Generates an HTML report
            "json:target/cucumber.json",         // JSON report for integration
            "junit:target/cucumber.xml"          // JUnit XML report for CI/CD
        },
        monochrome = true,           // Removes ANSI escape sequences for clean output
        dryRun = false,              // true: Checks if all steps are defined without executing
        strict = false,              // Deprecated (Cucumber v6+ runs undefined steps as failures)
        snippets = CucumberOptions.SnippetType.CAMELCASE, // Step definition format (CAMELCASE / UNDERSCORE)
        tags = "@SmokeTest or @RegressionTest", // Runs only scenarios with these tags
        publish = false              // true: Publishes execution report to Cucumber Reports
    )

    🔹 Possible Values:
    -------------------
    1️⃣ features: String or String[]  → Path(s) to feature files
    2️⃣ glue: String or String[]      → Packages containing step definitions
    3️⃣ plugin: String[]               → Output reports & formatters:
       - "pretty"                    → Readable console output
       - "html:target/cucumber.html"  → Generates an HTML report
       - "json:target/cucumber.json"  → JSON report for automation
       - "junit:target/cucumber.xml"  → JUnit report for CI tools
       - "rerun:target/rerun.txt"     → Saves failed scenarios for re-execution
    4️⃣ monochrome: boolean → true = Removes ANSI colors for clean output
    5️⃣ dryRun: boolean     → true = Checks step definitions without executing
    6️⃣ strict: boolean     → Deprecated (Use default behavior)
    7️⃣ snippets: CucumberOptions.SnippetType → "CAMELCASE" or "UNDERSCORE"
    8️⃣ tags: String        → Filters scenarios by tags (e.g., "@SmokeTest and not @WIP")
    9️⃣ publish: boolean    → true = Uploads results to Cucumber Cloud Reports
*/
}
