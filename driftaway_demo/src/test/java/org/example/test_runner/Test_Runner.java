package org.example.test_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org.example.step_defination"},
        tags ="@PlaceOrderSC_01",
        plugin = {"pretty", "html:target/report.html"}
        // dryRun = true
)

public class Test_Runner {
}
