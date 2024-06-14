package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/featureFiles/login.feature",glue = {"Steps"},plugin = {"html:target/cucucmber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCuke extends AbstractTestNGCucumberTests  {

}
