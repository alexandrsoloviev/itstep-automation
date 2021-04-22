package guiTest.tests;

import guiTest.utils.allure.AllureScreenShooter;
import guiTest.utils.driver.Driver;
import guiTest.utils.listener.ListenerTest;
import guiTest.pageObject.cart.CartPage;
import guiTest.pageObject.checkoutComplete.CheckoutCompletePage;
import guiTest.pageObject.checkoutStepOne.CheckoutStepOnePage;
import guiTest.pageObject.checkoutStepTwo.CheckoutStepTwoPage;
import guiTest.pageObject.inventory.InventoryPage;
import guiTest.pageObject.login.LoginPage;
import guiTest.utils.properties.ConfProperties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenerTest.class, AllureScreenShooter.class})

public class SwagLabTest {


    @BeforeTest(groups = "gui")
    public void startDriver() {
        Driver.getDriver();
    }

    @Test(priority = 1, groups = "gui")
    public void authorizationTest() {
        LoginPage.authorization(ConfProperties.getProperty("MY_LOGIN"), ConfProperties.getProperty("MY_PASSWORD"));

    }

    @Test(priority = 1, dependsOnMethods = {"authorizationTest"}, groups = "gui")
    public void inventoryTest() {
        InventoryPage.addItemsToCart();
    }


    @Test(priority = 1, dependsOnMethods = {"inventoryTest"}, groups = "gui")
    public void cartTest() {
        CartPage.clickCheckoutButton();
    }

    @Test(priority = 1, dependsOnMethods = {"cartTest"}, groups = "gui")
    public void checkOutStepOneTest() {
        CheckoutStepOnePage.enterPersonalData(ConfProperties.getProperty("MY_FIRST_NAME"),
                ConfProperties.getProperty("MY_LAST_NAME"),
                ConfProperties.getProperty("POSTAL_CODE"));
    }


    @Test(priority = 1, dependsOnMethods = {"checkOutStepOneTest"}, groups = "gui")
    public void checkOutStepTwoTest() {
        CheckoutStepTwoPage.clickFinishButton();
    }

    @Test(priority = 1, dependsOnMethods = {"checkOutStepTwoTest"}, groups = "gui")
    public void checkOutCompleteTest() {
        CheckoutCompletePage.finishStep();
    }

    @AfterTest(groups = "gui")
    public void closeBrowser() {
        Driver.teardown();
    }


}


