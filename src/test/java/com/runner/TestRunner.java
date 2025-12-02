package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\login.feature",glue="com.stepdefinition",dryRun = false,
plugin= {"pretty","junit:target/JUnitReport/Report.xml",
		"json:target/JSONReport/Report.json",
		"html:target/HTMLReport/Report.html"},
		tags="@sanitytest")
public class TestRunner {

	
}
