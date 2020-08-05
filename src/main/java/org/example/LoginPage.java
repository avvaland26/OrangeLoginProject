package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Util {
   private By _UserName = By.id("txtUsername");
   private By _Password = By.id("txtPassword");
   private By _loginButton = By.id("btnLogin");
   private By _LoginPanel = By.id("logInPanelHeading");
   String expectedMessage = "LOGIN Panel";

   public void verifyUserIsOnLoginPage(){
       assertTextMessage(getTextFromElement(_LoginPanel),expectedMessage,"user on login page");

   }
    public void userEnterLoginDetails(){
       typeText(_UserName,"Admin");
       typeText(_Password,"admin123");

    }
    public void userClickOnLoginButton(){
        clickOnElement(_loginButton);
    }
    public void userTypeInvalidLoginDetails(){
       typeText(_UserName,"admin");
       typeText(_Password,"kavya123");

    }
   // public void verifySuccessfulMessage(){
   //    assertTextMessage();

   // }
}
