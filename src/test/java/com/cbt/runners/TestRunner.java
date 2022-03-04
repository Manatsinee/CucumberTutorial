package com.cbt.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // it always start with src
        glue = "com/cbt/step_definitions",
        tags = "@scenario_outline", //Test Annotation
        dryRun = false,
        plugin = "json:target/cucumber.json"

)
public class TestRunner {

}
