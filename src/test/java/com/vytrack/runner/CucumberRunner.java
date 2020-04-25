package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        //dryRun=true  checking if every test has code implementation, otherwise cucumber wil create it
        dryRun = false, // execute test
        strict = false,
        tags = "@create_car_ddt", // for skipping this method "@driver" for running only this method
//it will run one which execute but if we have both it will run both
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }
)
public class CucumberRunner {

}
