package tests;

import PageObjects.RedirectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static PageObjects.RedirectPage.*;
import static org.testng.Assert.assertEquals;

public class RedirectTest extends BaseTest {

    @Test(groups = "Desktop")
    public void redirectButtonsTest() {
        String expectedURL = "https://testpages.herokuapp.com/styled/redirected.html";


        driver.get(START_PAGE_URL_REDIRECT);

        RedirectPage redirectPage = new RedirectPage(driver);

        redirectPage.getDelayBasicBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(GO_BACK_ID)));
        assertEquals(expectedURL, driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina corecta dupa apasarea butonului de delay basic");

        redirectPage.getGoBackBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BOUNCE_ID)));

        redirectPage.getDelayBounceBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(GO_BACK_ID)));
        assertEquals(expectedURL, driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina corecta dupa apasarea butonului de delay bounce");

        redirectPage.getGoBackBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BASIC_ID)));
        assertEquals(START_PAGE_URL_REDIRECT,driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina de start dupa apasarea butonului Go back");

    }



    @Test(groups = "Mobile")
    public void redirectButtonsTestForMobile() {
        String expectedURL = "https://testpages.herokuapp.com/styled/redirected.html";

        driver.get(START_PAGE_URL_REDIRECT);

        RedirectPage redirectPage = new RedirectPage(driver);

        redirectPage.getDelayBasicBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(GO_BACK_ID)));
        assertEquals(expectedURL, driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina corecta dupa apasarea butonului de delay basic");

        redirectPage.getGoBackBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BOUNCE_ID)));

        redirectPage.getDelayBounceBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(GO_BACK_ID)));
        assertEquals(expectedURL, driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina corecta dupa apasarea butonului de delay bounce");

        redirectPage.getGoBackBtn().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BASIC_ID)));
        assertEquals(START_PAGE_URL_REDIRECT,driver.getCurrentUrl(),
                "Nu am fost redirectionati la pagina de start dupa apasarea butonului Go back");

    }
}
