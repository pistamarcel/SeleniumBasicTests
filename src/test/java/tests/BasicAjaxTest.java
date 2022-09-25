package tests;

import PageObjects.BasicAjaxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static PageObjects.BasicAjaxPage.LOAD_IMAGE_ID;
import static PageObjects.BasicAjaxPage.START_PAGE_URL_AJAX;

public class BasicAjaxTest extends BaseTest {



    @Test(groups = "Desktop")
    public void dropDownTest() {

        Integer category = 1;
        Integer language = 2;



        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        driver.get(START_PAGE_URL_AJAX);

        basicAjaxPage.getDropDownCategory().get(category).click();

        getWait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.id(LOAD_IMAGE_ID)));
        basicAjaxPage.getDropDownLanguage().get(language).click();
        String languageID = String.valueOf(Integer.valueOf(basicAjaxPage.getDropDownLanguage().get(language).getAttribute("value")));
        String categoryID = String.valueOf(Integer.valueOf(basicAjaxPage.getDropDownCategory().get(category).getAttribute("value")));

        basicAjaxPage.getBtn().click();

        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("_valueid")));

        System.out.println(basicAjaxPage.getCategorySelected().getText());
        System.out.println(basicAjaxPage.getLanguageSelected().getText());

        Assert.assertEquals(driver.getCurrentUrl(),"https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1");
        Assert.assertEquals(languageID, basicAjaxPage.getLanguageSelected().getText());
        Assert.assertEquals(categoryID, basicAjaxPage.getCategorySelected().getText());
    }


    @Test(groups = "Mobile")
    public void dropDownTestForMobile() {

        Integer category = 1;
        Integer language = 2;

        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);

        basicAjaxPage.getDropDownCategory().get(category).click();

        getWait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.id(LOAD_IMAGE_ID)));
        basicAjaxPage.getDropDownLanguage().get(language).click();
        String languageID = String.valueOf(Integer.valueOf(basicAjaxPage.getDropDownLanguage().get(language).getAttribute("value")));
        String categoryID = String.valueOf(Integer.valueOf(basicAjaxPage.getDropDownCategory().get(category).getAttribute("value")));

        basicAjaxPage.getBtn().click();

        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("_valueid")));

        System.out.println(basicAjaxPage.getCategorySelected().getText());
        System.out.println(basicAjaxPage.getLanguageSelected().getText());

        Assert.assertEquals(driver.getCurrentUrl(),"https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1");
        Assert.assertEquals(languageID, basicAjaxPage.getLanguageSelected().getText());
        Assert.assertEquals(categoryID, basicAjaxPage.getCategorySelected().getText());
    }

}
