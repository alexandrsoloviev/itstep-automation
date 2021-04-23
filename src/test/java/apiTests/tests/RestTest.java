package apiTests.tests;


import apiTests.pojos.UserRequest;
import apiTests.pojos.CreateUserResponse;
import apiTests.pojos.UserPojoFull;
import apiTests.utils.RestWrapper;
import apiTests.utils.UserGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class RestTest {

    private static RestWrapper api;

    @BeforeMethod (groups = "api")
    public static void prepareClient(){
        api = RestWrapper.loginAs("eve.holt@reqres.in", "cityslicka");
    }


    @Test (groups = "api")
    public void getUsers() {
       assertThat(api.user.getUsers()).extracting(UserPojoFull::getEmail).contains("george.bluth@reqres.in");
    }

    @Test (groups = "api")
    public void creatUser() {
        UserRequest rq = UserGenerator.getSimpleUser();
        CreateUserResponse rs = api.user.createUser(rq);

        assertThat(rs)
                .isNotNull()
                .extracting(CreateUserResponse::getName)
                .isEqualTo(rq.getName());
    }

    @Test (groups = "api")
    public void getUser(){
        assertThat(api.user.getUser(7));
    }
}
