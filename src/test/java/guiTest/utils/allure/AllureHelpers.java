package guiTest.utils.allure;

import guiTest.utils.driver.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.nio.charset.StandardCharsets;

public final class AllureHelpers {


    @Attachment(value = "AllureTextReport", type = "text/plain", fileExtension = ".txt")
    public static String attachText(final String text) {
        return text;
    }


    @Attachment(value = "AllureCSVReport", type = "text/csv", fileExtension = ".csv")
    public static String attachCSV(final String csv) {
        return csv;
    }


    @Attachment(value = "Html source", type = "text/html", fileExtension = ".html")
    public static byte[] getPageSource() {
        return getPageSourceBytes();
    }


    @Attachment(value = "Screenshot", type = "image/png", fileExtension = ".png")
    public static byte[] takeScreenshot() {
        return getScreenshotBytes();
    }


    @Attachment(value = "{name}", type = "image/png", fileExtension = ".png")
    public static byte[] takeScreenshot(final String name) {
        return getScreenshotBytes();
    }


    public static byte[] getPageSourceBytes() {
        return Driver.getDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }


    public static byte[] getScreenshotBytes() {
        return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
