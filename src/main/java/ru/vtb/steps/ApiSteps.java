package ru.vtb.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import cucumber.api.java.ru.Пусть;
import org.junit.Assert;
import ru.vtb.entities.Account;

import java.io.IOException;

import static com.jayway.restassured.RestAssured.given;

public class ApiSteps {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String accountsEndPoint = "http://kn-ktapp.herokuapp.com/apitest/accounts/";

    @Пусть("^пользователь протестировал http://kn-ktapp.herokuapp.com/apitest/accounts")
    public void пользовательПротестировал() throws Throwable {
        Response response = given().get(accountsEndPoint);
        Account[] accounts = objectMapper.readValue(response.body().asString(), Account[].class);
        for (Account acc : accounts) {
            checkAccId(acc.getAccount_id());
        }
    }

    @Пусть("^пользователь протестировал счет \"([^\"]*)\"$")
    public void пользовательПротестировалСчет(String accId) throws IOException {
        Response response = given().get(accountsEndPoint + accId);
        Account acc = objectMapper.readValue(response.body().asString(), Account.class);
        checkAccId(acc.getAccount_id());
    }

    private void checkAccId(String str) {
        Assert.assertNotEquals(null, str);
        Assert.assertNotEquals("0", str);
        Assert.assertNotEquals("", str);
        Assert.assertTrue(Integer.parseInt(str) > 0);
    }
}
