package guiTest.pageObject.basePage;

import guiTest.utils.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BasePage {



    protected static WebElement initElement(By by) {
        return Driver.getDriver().findElement(by);
    }


    protected static void input(By element, String text) {

        initElement(element).sendKeys(text);
    }

    protected static void clickButton(By element) {
        initElement(element).click();

    }

    protected static void contentIsVisible(By element) {
        initElement(element).isDisplayed();
    }
}


