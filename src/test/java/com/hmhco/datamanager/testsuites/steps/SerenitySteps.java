package com.hmhco.datamanager.testsuites.steps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * Created by vadlamudis on 7/12/18.
 */
public class SerenitySteps {

    @Steps
    private LoginPageSteps loginPageSteps;


    @Given ("User lanches DM site")
    public void launch() {
        loginPageSteps.openDMUrl();
        loginPageSteps.enterCredentials();
        loginPageSteps.clickLogin();
    }

}
