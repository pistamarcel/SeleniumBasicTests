package tests;

import PageObjects.RefreshPage;
import org.testng.annotations.Test;

import static PageObjects.RefreshPage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class RefreshTest extends BaseTest{

    @Test(groups = "Desktop")
    public void refreshTest() throws InterruptedException {
         driver.get(START_PAGE_URL_Refresh);

        RefreshPage refreshPage = new RefreshPage(driver);

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val1 = Integer.parseInt(refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val2= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val1,val2);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val3= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val2,val3);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val4= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val3,val4);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());


    }




    @Test(groups = "Mobile")
    public void refreshTestForMobile() throws InterruptedException {
        driver.get(START_PAGE_URL_Refresh);

        RefreshPage refreshPage = new RefreshPage(driver);

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val1 = Integer.parseInt(refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val2= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val1,val2);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val3= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val2,val3);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        int val4= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(val3,val4);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

    }

}
