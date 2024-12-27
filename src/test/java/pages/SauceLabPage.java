package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceLabPage {

    public SauceLabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(xpath = "(//*[@*='inventory_item_name '])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(id = "add-to-cart")
    public WebElement ilkUrunAddToCardButonu;

    @FindBy(id = "shopping_cart_container")
    public WebElement alisverisSepetiButonu;

    @FindBy(xpath = "//*[@*='inventory_item_name']")
    public WebElement sepettekiUrunIsimElementi;

}
