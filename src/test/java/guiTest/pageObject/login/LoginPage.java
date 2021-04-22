package guiTest.pageObject.login;

import guiTest.pageObject.basePage.BasePage;
import io.qameta.allure.Step;

public class LoginPage extends BasePage {

    @Step("Authorization with login '{MY_LOGIN}', password '{MY_PASSWORD}'")
    public static void authorization(String MY_LOGIN, String MY_PASSWORD) {
        input(LoginPageLocators.LOGIN, MY_LOGIN);
        input(LoginPageLocators.PASSWORD, MY_PASSWORD);
        clickButton(LoginPageLocators.CLICK_SIGN_IN_BUTTON);
        contentIsVisible(LoginPageLocators.CONTENT_IS_VISIBLE);
    }
}