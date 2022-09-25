package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RedirectPage {

   public RedirectPage(ChromeDriver driver){

        PageFactory.initElements(driver , this);
 }
   public static final String START_PAGE_URL_REDIRECT = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";
   public static final String DELAY_BOUNCE_ID ="delaygotobounce";
   public static final String GO_BACK_ID = "goback";
   public static final String DELAY_BASIC_ID = "delaygotobasic";


    @FindBy(id=DELAY_BASIC_ID)
    private WebElement delayBasicBtn;

    @FindBy(id=GO_BACK_ID)
    private WebElement goBackBtn;

    @FindBy(id=DELAY_BOUNCE_ID)
    private WebElement delayBounceBtn;


    public WebElement getDelayBasicBtn() {
        return delayBasicBtn;
    }

    public WebElement getGoBackBtn() {
        return goBackBtn;
    }

    public WebElement getDelayBounceBtn() {
        return delayBounceBtn;
    }

}
