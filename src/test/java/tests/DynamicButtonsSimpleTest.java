package tests;

import PageObjects.DynamicButtonsSimplePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static PageObjects.DynamicButtonsSimplePage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicButtonsSimpleTest extends BaseTest {


    @Test(groups = "Desktop")
    public void DynamicButtonsTest(){
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(START_PAGE_URL_DBS);
        dynamicButtonsSimplePage.getStartButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(SECOND_BUTTON_CSS)));

        dynamicButtonsSimplePage.getSecondtButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(THIRD_BUTTON_CSS)));

        dynamicButtonsSimplePage.getThirdButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(FOURTH_BUTTON_CSS)));

        dynamicButtonsSimplePage.getFourthButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message_BUTTON_CSS)));
        System.out.println(dynamicButtonsSimplePage.getMessageButton().getText());

        assertTrue(isElementPresent(By.id(Message_BUTTON_CSS)),"Nu sa afisat mesajul desi am apasat toate butoanele" );
        assertEquals(dynamicButtonsSimplePage.getMessageButton().getText(),"All Buttons Clicked",
                "Nu sa afisat mesajul corespunzator");

    }


    @Test(groups = "Mobile")
    public void DynamicButtonsTestForMobile(){
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(START_PAGE_URL_DBS);
        dynamicButtonsSimplePage.getStartButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(SECOND_BUTTON_CSS)));

        dynamicButtonsSimplePage.getSecondtButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(THIRD_BUTTON_CSS)));

        dynamicButtonsSimplePage.getThirdButton().click();
        getWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(FOURTH_BUTTON_CSS)));

        dynamicButtonsSimplePage.getFourthButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message_BUTTON_CSS)));
        System.out.println(dynamicButtonsSimplePage.getMessageButton().getText());

        assertTrue(isElementPresent(By.id(Message_BUTTON_CSS)),"Nu sa afisat mesajul desi am apasat toate butoanele" );
        assertEquals(dynamicButtonsSimplePage.getMessageButton().getText(),"All Buttons Clicked",
                "Nu sa afisat mesajul corespunzator");

    }



}
