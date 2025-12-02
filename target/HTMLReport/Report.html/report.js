$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Validation of login page in facebook web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_02 Validation of Create new Account Block",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "name": "User launch the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User maximize the browser",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_maximize_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Create new account Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_Create_new_account_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verfity the create new account text displayed or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verfity_the_create_new_account_text_displayed_or_not()"
});
formatter.result({
  "status": "passed"
});
});