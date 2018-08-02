package com.hmhco.datamanager.testsuites.steps;

/**
 * Created by vadlamudis on 7/12/18.
 */
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/example/LoginUser.feature")
public class SerenityTestSuite {
}
