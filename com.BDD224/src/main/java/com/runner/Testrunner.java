package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdefs",
		plugin="html:target",
		dryRun = false,
		monochrome=true,
		tags={"@jbk1 , @jbk2"}
	
		
		)
public class Testrunner {

}
