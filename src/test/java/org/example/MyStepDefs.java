package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    LoginPage loginPage = new LoginPage();
    LoginSuccessfullyPage loginSuccessfullyPage = new LoginSuccessfullyPage();


    @Given("^user is on loginPage$")
    public void user_is_on_loginPage()  {
     loginPage.verifyUserIsOnLoginPage();
    }

    @When("^user type valid username$")
    public void user_type_valid_username()  {
     loginPage.userEnterLoginDetails();
    }

    @And("^user type valid password$")
    public void user_type_valid_password()  {
        //loginPage.userEnterLoginDetails();
    }

    @And("^user click on login button$")
    public void user_click_on_login_button() {
      loginPage.userClickOnLoginButton();
    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() {
        loginSuccessfullyPage.userCanSeeSuccessfulMessage();
     loginSuccessfullyPage.verifyUserIsOnResultPage();

    }

    @When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userTypeAnd(String username, String password) {
     loginPage.userTypeInvalidLoginDetails();
    }

    @Then("^user should not be login successfully and see this \"([^\"]*)\"$")
    public void userShouldNotBeLoginSuccessfullyAndSeeThis(String message) {

    }
}


