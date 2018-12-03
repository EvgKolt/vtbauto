package ru.open.api;

import static com.jayway.restassured.RestAssured.given;

public class ApiTester {
    //howToGetSSO->Select * from tb_organization where inn = '*********';

    public void checkStatusCodeGET(String uri) {
        //header helps to ignore authorisation
        given().
                header("Authorization", "sso_____628ab4ef-f8e4-4516-93e2-ccbb832c9f2f").
                when().get(uri).then().statusCode(401);
        //to do поменять статус на 200 когда сделают хедер на 273 стенде
    }

    public void checkStatusCodeGETSMS(String uri) {
        //header helps to ignore authorisation
        given().
                header("Authorization", "Bearer dev_1.0_sso_____628ab4ef-f8e4-4516-93e2-ccbb832c9f2f").
                when().get(uri).then().statusCode(200);
    }

    public void checkResponseBody() {

    }

    public void checkErrorCode() {

    }
}
