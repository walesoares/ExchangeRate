package config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","json:target/cucumber-report.jason" }
        ,features = "src/test/java/features",
        glue = {"stepDefs"}, tags = {"@getUsd"})

public class RunCukesTest {

    //set the tag for the test you want to run from your cucumber feature file

}
