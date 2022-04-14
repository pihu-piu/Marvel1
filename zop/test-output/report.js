$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Example/Login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://demo.openmrs.org/openmrs/referenceapplication/login.page\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters login Email as \"piy@gmail.com\" and Password as \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_enters_login_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_get_message()"
});
formatter.result({
  "status": "passed"
});
});