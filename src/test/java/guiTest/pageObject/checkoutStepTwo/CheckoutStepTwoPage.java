package guiTest.pageObject.checkoutStepTwo;

import guiTest.pageObject.basePage.BasePage;
import io.qameta.allure.Step;

public class CheckoutStepTwoPage extends BasePage {

    @Step("click FINISH button")
    public static void clickFinishButton(){
        clickButton(CheckoutStepTwoPageLocators.CLICK_FINISH_BUTTON);
        contentIsVisible((CheckoutStepTwoPageLocators.CONTENT_IS_VISIBLE));


    }
}
