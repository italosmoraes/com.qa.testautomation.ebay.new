package ebay.qa.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
plugin = {"json:build/cucumber.json"},
features = {"classpath:features"},
glue= {"ebay.qa.testautomation"},
tags = {"@Scenario001"}
)

public class TestRunner {
	
}
