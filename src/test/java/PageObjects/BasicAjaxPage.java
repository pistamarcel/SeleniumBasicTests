package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasicAjaxPage {

 public BasicAjaxPage(RemoteWebDriver driver){

     PageFactory.initElements(driver , this);
 }
    public static final String LOAD_IMAGE_ID="ajaxBusy";
    public static final String START_PAGE_URL_AJAX = "https://testpages.herokuapp.com/styled/basic-ajax-test.html";

    @FindBy(id=LOAD_IMAGE_ID)
    private WebElement loadImage;
    @FindBy(css="#combo1 option")
    private List <WebElement>  dropDownCategory;
    @FindBy(css="#combo2 option")
    private  List<WebElement> dropDownLanguage;

    @FindBy(css = "input.styled-click-button")
    private WebElement btn;

    @FindBy(id = "_valueid")
    private WebElement categorySelected;

    @FindBy(id = "_valuelanguage_id")
    private WebElement languageSelected ;

    public WebElement getBtn() {
        return btn;
    }

    public WebElement getCategorySelected() {
        return categorySelected;
    }

    public WebElement getLanguageSelected() {
        return languageSelected;
    }



    public List<WebElement> getDropDownCategory() {
        return dropDownCategory;
    }

    public List<WebElement> getDropDownLanguage() {
        return dropDownLanguage;
    }
}
