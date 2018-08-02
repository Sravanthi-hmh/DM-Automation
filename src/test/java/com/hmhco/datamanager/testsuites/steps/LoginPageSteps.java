package com.hmhco.datamanager.testsuites.steps;

import com.hmhco.datamanager.config.EnvironmentConfiguration;
import com.hmhco.datamanager.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by vadlamudis on 7/12/18.
 */
public class LoginPageSteps extends ScenarioSteps {

    @Steps
    private LoginPage loginPage;


    @Step
    public void openDMUrl() {
        loginPage.openAt(EnvironmentConfiguration.getValue("dm.url"));
    }

    @Step
    public void enterCredentials() {
        loginPage.enterCredentials();
    }

    @Step
    public void clickLogin() {
        loginPage.clickLogin();
    }

//    @Step
//    public void enterCredentialsAndLoginWithErrorHandling() {
//
//        enterCredentials();
//        clickLogin();
//
//        if (!loginPage.amILoggedIn()) {
//
//            getDriver().manage().deleteAllCookies();
//            getDriver().navigate().refresh();
//            openDMUrl();
//            enterCredentials();
//            clickLogin();
//        }
//    }

}
