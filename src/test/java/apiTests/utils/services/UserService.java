package apiTests.utils.services;

import apiTests.pojos.UserRequest;
import apiTests.pojos.CreateUserResponse;
import apiTests.pojos.UserPojoFull;
import io.restassured.http.Cookies;
import java.util.List;
import static io.restassured.RestAssured.given;

public class UserService extends RestService {

    @Override
    protected String getBasePath() {
        return "/users";
    }

    public UserService(Cookies cookies) {
        super(cookies);
    }

    public CreateUserResponse createUser(UserRequest rq){
        return given().spec(REQ_SPEC).body(rq).post().as(CreateUserResponse.class);
    }

    public List<UserPojoFull> getUsers(){
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("data", UserPojoFull.class);
    }

    //Получение пользователя по id
    public UserPojoFull getUser(int id){
        return  given().spec(REQ_SPEC)
                .get("/" + id)
                .as(UserPojoFull.class);
    }


}
