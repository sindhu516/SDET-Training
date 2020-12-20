package ProjectActivitiesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/ProjectFeatures",
    glue = {"StepDefinition"},
//    tags ="@JobBoard_Activity_2",
    plugin = {"html:src/test/java/Reports/test-report.html"},

    monochrome = true
)

public class ProjectRunner {

}