$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/openweather/map/Feature.feature");
formatter.feature({
  "name": "To verify all important information is present on the page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Verification.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to ApplicationURL",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of fields on the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Firstage"
    }
  ]
});
formatter.step({
  "name": "The field with locatorName should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "Verification.fieldPresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Total number of links present",
  "keyword": "Then "
});
formatter.match({
  "location": "Verification.linksverify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Verification.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to ApplicationURL",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "On entering invalid data website suggests city is Not found",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "User enters the invalid name of city as xyz",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.enterCity(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the button",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The output should be Not found",
  "keyword": "Then "
});
formatter.match({
  "location": "Verification.output(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Verification.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to ApplicationURL",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "On entering valid data website successfully returns weather details for the city.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "User enters the valid name of city as Mumbai",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.enterCityName(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the button",
  "keyword": "And "
});
formatter.match({
  "location": "Verification.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The correct result should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Verification.correctData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});