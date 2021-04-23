package apiTests.utils.services;

import apiTests.pojos.UserPojoFull;
import io.restassured.http.Cookies;


import java.util.List;

import static io.restassured.RestAssured.given;

public class OrderService extends RestService{

    @Override
    protected String getBasePath() {
        return "/orders";
    }

    public OrderService(Cookies cookies) {
        super(cookies);
    }

    public List<UserPojoFull> getOrders(){
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("data", UserPojoFull.class);
    }
}
