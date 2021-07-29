package stepDefs;

import callers.ServiceCallers;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.DataModel;
import org.junit.Assert;

public class ServiceCallerSteps {

    private ServiceCallers serviceCallers ;
    private DataModel dataModel ;
    public Response response ;
    private ValidatableResponse validatableResponse ;
    private RequestSpecification requestSpecification ;


    public ServiceCallerSteps (ServiceCallers serviceCallers, DataModel dataModel) {

        this.serviceCallers = serviceCallers ;
        this.dataModel = dataModel ;


    }


    @Given("^i am a (.*) api user$")
    public void iAmApiUser (String setEnvironment)  throws Throwable{

        switch (setEnvironment) {

            case "currency" :
                Assert.assertTrue(!dataModel.getBaseURL().isEmpty());

        }


    }

    //step definition for the get request
    @When("^i send a get Request for usd exchange rate$")
    public void iSendAGetRequestForUsdExchangeRate() throws Throwable{
        response = serviceCallers.getRequest(dataModel.getEnvProperties("usdQueryPath")) ;


    }

    //code to check http response returned
    @Then("^http response code should be (.*)$")
    public void httpResponseCodeShouldBe(int responseCode) throws Throwable {
        validatableResponse = response.then().assertThat().statusCode(responseCode) ;
    }


    //code to validate response body contains specified body
    @And("^response body should contain (.*)$")
    public void responseBodyShouldContainGBP(String body) throws Throwable{
        Assert.assertTrue(response.body().asString().contains(body)) ;
    }


    //code to confirm count on object size returned
    @And("^total number of currency returned is (.*)$")
    public void totalNumberOfCurrencyReturnedIs(int currency) throws Throwable {
        JsonPath jsonPath = new JsonPath(response.asString()) ;
        Assert.assertEquals(currency, jsonPath.getInt("conversion_rates.size()"));

    }
}
