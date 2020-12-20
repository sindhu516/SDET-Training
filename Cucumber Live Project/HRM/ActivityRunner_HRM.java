package ProjectActivityRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"StepDefinitions"},
//  tags ="@HRM_Activity_4",
    plugin = {"html:src/test/java/Reports/test-report.html"},

    monochrome = true
)



public class ActivityRunner_HRM {

}