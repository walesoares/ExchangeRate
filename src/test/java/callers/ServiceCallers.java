package callers;

import helpers.Apihelpers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ServiceCallers extends Apihelpers {

    public Response restResponse ;


    public ServiceCallers () {
        super(dataModel);
    }



    //code for get request on the api
    public static Response getRequest (String queryPath) {
        return  given().contentType("application/json")
                .baseUri("https://v6.exchangerate-api.com")
                .when()
                .get(queryPath) ;


    }





}
