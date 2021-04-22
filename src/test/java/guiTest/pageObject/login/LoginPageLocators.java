package guiTest.pageObject.login;

import org.openqa.selenium.By;

public class LoginPageLocators {


    public static final By LOGIN = By.xpath("//input[@id='user-name']");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By CLICK_SIGN_IN_BUTTON = By.xpath("//input[@id='login-button']");
    public static final By CONTENT_IS_VISIBLE = By.xpath("//span[contains(text(),'Products')]");


}
