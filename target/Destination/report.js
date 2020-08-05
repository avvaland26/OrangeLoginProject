$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13026050600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to login successfully",
  "description": "",
  "id": "login-feature;user-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on loginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user type valid username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user type valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_loginPage()"
});
formatter.result({
  "duration": 1226501500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_type_valid_username()"
});
formatter.result({
  "duration": 2657190200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_type_valid_password()"
});
formatter.result({
  "duration": 43800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_login_button()"
});
formatter.result({
  "duration": 2967562800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 2012431000,
  "status": "passed"
});
formatter.after({
  "duration": 3373959100,
  "status": "passed"
});
});