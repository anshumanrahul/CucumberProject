package Automation_Cucumber.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Rahul.Anshuman\\git\\CucumberProject\\Cucumber\\Feature"
		,glue={"stepDefinition"}
		,plugin= {"pretty"}
		,monochrome=true
		)

public class TestRunner {

}
