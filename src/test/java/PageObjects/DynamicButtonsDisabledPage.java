package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicButtonsDisabledPage {

    public DynamicButtonsDisabledPage(ChromeDriver driver){

        PageFactory.initElements(driver , this);
    }
    public static final String START_PAGE_URL_DBD = "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html";
    public static final String SECOND_BUTTON_ID = "button01";
    public static final String THIRD_BUTTON_ID  = "button02";
    public static final String FOURTH_BUTTON_ID = "button03";
    public static final String Message_BUTTON_ID = "buttonmessage";


    @FindBy(id = "button00")
    private WebElement startButton;

    @FindBy(id = SECOND_BUTTON_ID)
    private WebElement secondtButton;

    @FindBy(id = THIRD_BUTTON_ID)
    private WebElement thirdButton;

    @FindBy(id = FOURTH_BUTTON_ID)
    private WebElement fourthButton;

    @FindBy(id =Message_BUTTON_ID)
    private WebElement messageButton;

    public WebElement getStartButton() {
        return startButton;
    }

    public WebElement getSecondtButton() {
        return secondtButton;
    }

    public WebElement getThirdButton() {
        return thirdButton;
    }

    public WebElement getFourthButton() {
        return fourthButton;
    }

    public WebElement getMessageButton() {
        return messageButton;
    }

}

