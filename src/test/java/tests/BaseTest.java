package tests;

import driver.DriverConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {
    protected RemoteWebDriver driver = null;

    @BeforeMethod(onlyForGroups = {"Desktop"})
    public void beforeMethodWithLogin() throws MalformedURLException {
        driver = DriverConfig.getRemoteChromeDriver();



    }
    @BeforeMethod(onlyForGroups = {"Mobile"})
    public void beforeMethodWithoutLogin() {
        driver = DriverConfig.getChromedriverForMobile();

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected FluentWait<RemoteWebDriver> getWait(RemoteWebDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class);

    }

    protected boolean isElementPresent(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }


}
