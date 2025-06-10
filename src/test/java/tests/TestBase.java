package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    protected static final String FREE_API_KEY_NAME = "x-api-key";
    protected static final String FREE_API_KEY_VALUE = "reqres-free-v1";
    protected static final String USERS_END_POINT = "/users/";
    protected static final String RESOURS_END_POINT = "/unknown/";

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }


}
