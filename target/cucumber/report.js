$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Currency.feature");
formatter.feature({
  "line": 2,
  "name": "Get Currency",
  "description": "",
  "id": "get-currency",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_ExchangeRate"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User is able to request get USD",
  "description": "",
  "id": "get-currency;user-is-able-to-request-get-usd",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@getUsd"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "i am a currency api user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i send a get Request for usd exchange rate",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "http response code should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "response body should contain GBP",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "total number of currency returned is 160",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "currency",
      "offset": 7
    }
  ],
  "location": "ServiceCallerSteps.iAmApiUser(String)"
});
formatter.result({
  "duration": 181191100,
  "status": "passed"
});
formatter.match({
  "location": "ServiceCallerSteps.iSendAGetRequestForUsdExchangeRate()"
});
formatter.result({
  "duration": 2691032900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "ServiceCallerSteps.httpResponseCodeShouldBe(int)"
});
formatter.result({
  "duration": 36199200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 29
    }
  ],
  "location": "ServiceCallerSteps.responseBodyShouldContainGBP(String)"
});
formatter.result({
  "duration": 12645500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "160",
      "offset": 37
    }
  ],
  "location": "ServiceCallerSteps.totalNumberOfCurrencyReturnedIs(int)"
});
formatter.result({
  "duration": 412859900,
  "status": "passed"
});
});