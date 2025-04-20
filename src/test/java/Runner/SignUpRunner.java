package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
        features = "src/main/resources/feature",
        glue = {"Steps"},
        // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@smo"
        )

        public class SignUpRunner extends AbstractTestNGCucumberTests {}
