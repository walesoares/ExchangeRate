@Feature_ExchangeRate
  Feature: Get Currency

    @getUsd
    Scenario: User is able to request get USD
      Given i am a currency api user
      When i send a get Request for usd exchange rate
      Then http response code should be 200
      And response body should contain GBP
      And total number of currency returned is 160
