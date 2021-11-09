package in.reqres.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseReqresApiTest {

    protected static final String SINGLE_USER_ENDPOINT = "api/users/2";

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }
}
