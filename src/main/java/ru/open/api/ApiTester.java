package ru.open.api;

import static com.jayway.restassured.RestAssured.given;

public class ApiTester {
    //howToGetSSO->Select * from tb_organization where inn = '*********';

    public void checkStatusCodeGET(String uri) {
        //header helps to ignore authorisation
        given().
                header("Authorization", "Bearer dev_1.0_sso_____00a596c0-30ea-484c-8901-cefe36c31799").
                when().get(uri).then().statusCode(200);
    }

    public void checkStatusCodeGETSMS(String uri) {
        //header helps to ignore authorisation
        given().
                header("Authorization", "Bearer dev_1.0_sso_____d4ea8475-b39e-4074-9cd2-b274d26fe33c").
                when().get(uri).then().statusCode(200);
    }

    public void checkResponseBody() {

    }

    public void checkErrorCode() {

    }
}
