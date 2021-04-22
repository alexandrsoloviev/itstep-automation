package guiTest.pageObject.checkoutComplete;

import guiTest.basePage.BasePage;
import io.qameta.allure.Step;

public class CheckoutCompletePage extends BasePage {

    @Step("Finish tests")
    public static void finishStep (){
        clickButton(CheckoutCompletePageLocators.CLICK_BACK_HOME_BUTTON);
        contentIsVisible(CheckoutCompletePageLocators.CONTENT_IS_VISIBLE);
    }
}
