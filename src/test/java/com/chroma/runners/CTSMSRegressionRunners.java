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
<<<<<<< HEAD
		tags = "@", 
		dryRun =  false, 
=======
		tags = "@CTSMSRegression", 
		dryRun = false, 
>>>>>>> 6d0cf40f42810bf2b64a83866d2b67d600078a3a
		monochrome = true, 
		strict = true
) 

public class CTSMSRegressionRunners {
    
}
