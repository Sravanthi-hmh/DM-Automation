package com.hmhco.datamanager.pages;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.concurrent.TimeUnit;

/**
 * Created by vadlamudis on 7/12/18.
 */
public class LoginPage extends PageObject {

    @FindBy(id = "ContentPlaceHolder1_Login1_UserName")
    public WebElementFacade userName;

    @FindBy(id = "ContentPlaceHolder1_Login1_Password")
    public WebElementFacade password;

    @FindBy(id = "ContentPlaceHolder1_Login1_Login")
    public WebElementFacade login;

    public void enterCredentials() {
        userName.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilPresent().type("rpcenviron+slwt@gmail.com");
        password.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilPresent().type("password1");

    }

    public void clickLogin() {
        login.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }


}
