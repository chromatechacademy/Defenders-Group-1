package com.chroma.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  }, 
		features = "src/test/java/com/chroma/features", 
		glue = "com.chroma.stepDefinitions", 
<<<<<<< HEAD:src/test/java/com/chroma/runners/Runners.java
		tags = "@DF-4", 
		dryRun = true, 
=======
		tags = "@CTSMSSmoke", 
		dryRun =  false, 
>>>>>>> 1c8fd16cbac1fd6e380ad65b98c5a7afa991d1b2:src/test/java/com/chroma/runners/CTSMSSmokeRunners.java
		monochrome = true, 
		strict = true
) 

public class CTSMSSmokeRunners {
    
}
