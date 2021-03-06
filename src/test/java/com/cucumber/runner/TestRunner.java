package com.cucumber.runner;
//package com.cucumber.runner;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue={"com.cucumber.test"},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
		)
 
public class TestRunner {
 
}