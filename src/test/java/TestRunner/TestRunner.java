package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Workspace\\DemoTest\\src\\test\\java\\Feature\\",
glue= {"Stepdefination","Hooks"},
plugin= {"pretty","html:target/cucumber-reports.html"}, //to generate different types of reporting
monochrome = true, 
strict = true,
dryRun = false,
publish=true)


public class TestRunner {

}
