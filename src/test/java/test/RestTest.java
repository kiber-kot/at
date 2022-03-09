package test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.junit.Assert.fail;

public class RestTest {

    private final String URL = "https://rest-assured.io";

public void checkStatusCode(int statusCode){
    if(getResponse(URL).statusCode() != statusCode){
        fail("ОШИБКА: status code не равен " + statusCode);
    }
}

    private static Response getResponse(String uri){
        return when()
                .get(uri);
    }
}
