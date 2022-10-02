package tests;

import PageObjects.DynamicButtonsDisabledPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static PageObjects.DynamicButtonsDisabledPage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicButtonsDisabledTest extends BaseTest {

    @Test(groups = "Desktop")
    public void dynamicBDTest(){
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        driver.get(START_PAGE_URL_DBD);

        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        dynamicButtonsDisabledPage.getStartButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(SECOND_BUTTON_ID)));

        dynamicButtonsDisabledPage.getSecondtButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(THIRD_BUTTON_ID)));

        dynamicButtonsDisabledPage.getThirdButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(FOURTH_BUTTON_ID)));

        dynamicButtonsDisabledPage.getFourthButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message_BUTTON_ID)));
        System.out.println(dynamicButtonsDisabledPage.getMessageButton().getText());

        assertTrue(isElementPresent(By.id(Message_BUTTON_ID)),"Nu sa afisat mesajul desi am apasat toate butoanele" );
        assertEquals(dynamicButtonsDisabledPage.getMessageButton().getText(),"All Buttons Clicked",
                "Nu sa afisat mesajul corespunzator");

    }

    @Test(groups = "Mobile")
    public void dynamicBDTestForMobile(){
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        driver.get(START_PAGE_URL_DBD);

        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        dynamicButtonsDisabledPage.getStartButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(SECOND_BUTTON_ID)));

        dynamicButtonsDisabledPage.getSecondtButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(THIRD_BUTTON_ID)));

        dynamicButtonsDisabledPage.getThirdButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(FOURTH_BUTTON_ID)));

        dynamicButtonsDisabledPage.getFourthButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message_BUTTON_ID)));
        System.out.println(dynamicButtonsDisabledPage.getMessageButton().getText());

        assertTrue(isElementPresent(By.id(Message_BUTTON_ID)),"Nu sa afisat mesajul desi am apasat toate butoanele" );
        assertEquals(dynamicButtonsDisabledPage.getMessageButton().getText(),"All Buttons Clicked",
                "Nu sa afisat mesajul corespunzator");

    }

}

