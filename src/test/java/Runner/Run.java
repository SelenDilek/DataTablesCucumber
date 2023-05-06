package Runner;


import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/Tests/Test.Feature",
        glue = {"StepDefinitions"},
        tags = "@smoke",
        dryRun = false ,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"}

)

public class Run {

}
