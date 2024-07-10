package runner;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;
import utils.ScreenshotUtil;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"})




public class TestRunner {

}

