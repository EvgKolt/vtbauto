package ru.open.api;

import static com.jayway.restassured.RestAssured.given;

public class ApiTester {
    //howToGetSSO->Select * from tb_organization where inn = '*********';

    public void checkStatusCodeGET(String URI) {
        //header helps to ignore authorisation
        given().
                header("Authorization", "Bearer dev_1.0_sso_____00a596c0-30ea-484c-8901-cefe36c31799").
                when().get(URI).then().statusCode(200);
    }

    public void checkResponseBody() {

    }

    public void checkErrorCode() {

    }
}
