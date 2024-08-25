package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class WaitUtil extends WebTestBase {
    public static long PAGE_LOAD = 50;
    public static WebDriverWait wait;
    public static long EXPLICIT_WAIT = 50;

    public static void waitUntilElementToBeClickable(WebElement element){
        wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


}
