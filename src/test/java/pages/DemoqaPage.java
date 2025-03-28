package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement alertsSekmesi;


    @FindBy(id = "timerAlertButton")
    public WebElement timerAlertButton;

    @FindBy(xpath = "//span[.='Dynamic Properties']")
    public WebElement dynamicPropertiesMenu;

    @FindBy(xpath = "//*[.='Elements']")
    public WebElement elementsSekmesi;

    @FindBy(id = "enableAfter")
    public WebElement enableAfter5SecondsButonu;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter5Seconds;
}
