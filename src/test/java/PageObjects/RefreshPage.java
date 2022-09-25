package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefreshPage {

    public RefreshPage(ChromeDriver driver){

        PageFactory.initElements(driver , this);
    }
    public static final String START_PAGE_URL_Refresh = "https://testpages.herokuapp.com/styled/refresh";
    public static final String REFRESH_DATE_VALUE_ID = "embeddedrefreshdatevalue";
    public static final String REFRESH_DATE = "refreshdate";


    @FindBy(id = REFRESH_DATE_VALUE_ID)
    private WebElement refreshDateValue;

    @FindBy(id = REFRESH_DATE)
    private WebElement refreshDate;

    public WebElement getRefreshDateValue() {
        return refreshDateValue;
    }

    public WebElement getRefreshDate() {
        return refreshDate;
    }
}


