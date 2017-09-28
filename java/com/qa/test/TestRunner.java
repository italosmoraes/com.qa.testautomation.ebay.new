package com.qa.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
plugin = {"json:build/cucumber.json"},
features = {"src/test/features"},
tags = {"@~ignore"},
glue= {"com.qa.test"}
)

public class TestRunner {
	
	public TestRunner(){
		
	}
	
}
