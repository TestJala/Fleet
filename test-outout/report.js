$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NegativeTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User is unable to login with wrong credentials",
  "description": "",
  "id": "login;user-is-unable-to-login-with-wrong-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User goes to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username as \"Gabriel200\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password as \"AnyText\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click \u0027Sign In\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});