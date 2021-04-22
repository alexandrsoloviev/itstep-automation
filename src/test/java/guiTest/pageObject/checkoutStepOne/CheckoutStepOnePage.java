package guiTest.pageObject.checkoutStepOne;

import guiTest.basePage.BasePage;
import io.qameta.allure.Step;

public class CheckoutStepOnePage extends BasePage {

    @Step("Enter personal data first name '{MY_FIRST_NAME}', last name '{MY_LAST_NAME}', postal code '{POSTAL_CODE}'")
    public static void enterPersonalData (String MY_FIRST_NAME, String MY_LAST_NAME,String POSTAL_CODE ) {
        input(CheckoutStepOnePageLocators.INPUT_FIRST_NAME,MY_FIRST_NAME);
        input(CheckoutStepOnePageLocators.INPUT_LAST_NAME,MY_LAST_NAME);
        input(CheckoutStepOnePageLocators.INPUT_POSTAL_CODE,POSTAL_CODE);
        clickButton(CheckoutStepOnePageLocators.CLICK_CONTINUE_BUTTON);
        contentIsVisible(CheckoutStepOnePageLocators.CONTENT_IS_VISIBLE);

    }
}
