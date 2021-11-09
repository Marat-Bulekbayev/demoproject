package in.reqres.test;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class ReqresApiTest extends BaseReqresApiTest {

    @Test
    public void testGetSingleUserEndpoint() {
        given()
                .when()
                .get(SINGLE_USER_ENDPOINT)
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("data.first_name", equalTo("Janet"));
    }
}
