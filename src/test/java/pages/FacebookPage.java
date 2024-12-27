package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "pass")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement loginButonu;

    @FindBy(xpath = "(//span[.='Allow all cookies'])[4]")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//*[@*='open-registration-form-button']")
    public WebElement yeniKayitOlusturButonu;

    @FindBy(name = "firstname")
    public WebElement kayitOlusturmaFirstnameKutusu;

    @FindBy(name = "websubmit")
    public WebElement signUpButonu;

}
