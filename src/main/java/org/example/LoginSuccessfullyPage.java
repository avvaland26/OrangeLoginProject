package org.example;

import org.openqa.selenium.By;

public class LoginSuccessfullyPage extends Util {

    private By _loginSuccessfulMessage = By.id("welcome");
    String expectedLoginSuccessfulMessage = "Welcome Admin";

  public void verifyUserIsOnResultPage(){
      assertURL("dashboard");
   }
    public void userCanSeeSuccessfulMessage(){
       assertTextMessage(getTextFromElement(_loginSuccessfulMessage),expectedLoginSuccessfulMessage,"user not on login page");

    }

}
